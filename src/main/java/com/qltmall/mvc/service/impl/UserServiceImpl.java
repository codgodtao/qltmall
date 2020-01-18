package com.qltmall.mvc.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.util.StringUtil;
import com.qltmall.mvc.common.api.CommonResult;
import com.qltmall.mvc.common.util.JwtTokenUtil;
import com.qltmall.mvc.dto.SecurityUserDetails;
import com.qltmall.mvc.mbg.mapper.UserMapper;
import com.qltmall.mvc.mbg.model.User;
import com.qltmall.mvc.mbg.model.UserExample;
import com.qltmall.mvc.service.RedisService;
import com.qltmall.mvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	// redis服务的添加，后期可添加更多使用
	@Autowired
	private RedisService redisService;
	@Value("${redis.key.prefix.authCode}")
	private String REDIS_KEY_PREFIX_QUTH_CODE;
	@Value("${redis.key.expire.authCode}")
	private Long AUTH_CODE_EXPIRE_SECONDS;

	@Autowired
	private UserMapper usermapper;
	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Value("${jwt.tokenHead}")
	private String tokenHead;

	@Override
	public String login(String username, String password) {
		String token = null;
		try {
			UserDetails userDetails = userDetailsService.loadUserByUsername(username);
			if (!passwordEncoder.matches(password, userDetails.getPassword()))
				throw new BadCredentialsException("密码错误");
			UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails,
					null, userDetails.getAuthorities());
			SecurityContextHolder.getContext().setAuthentication(authentication);
			token = jwtTokenUtil.generateToken(userDetails);
		} catch (AuthenticationException e) {
			LOGGER.warn("登陆异常", e.getMessage());
		}
		return token;
	}

	/**
	 * 利用redis生成验证码，进行确认身份
	 */
	@Override
	public CommonResult generateAuthCode(String telephone) {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			sb.append(random.nextInt(10));// 随机的10以内数字
		}
		redisService.set(REDIS_KEY_PREFIX_QUTH_CODE + telephone, sb.toString());
		redisService.expire(REDIS_KEY_PREFIX_QUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);
		return CommonResult.success(sb.toString(), "获取验证码成功");
	}

	/**
	 * 确认验证码正确
	 */
	private boolean vertifyAuthCode(String telephone, String authCode) {
		if(StringUtil.isEmpty(authCode)) {
			return false;
		}
		String realAuthCode = redisService.get(REDIS_KEY_PREFIX_QUTH_CODE + telephone);
		return authCode.equals(realAuthCode);
	}

	@Override
	public User getUserByuserName(String userName) {
		UserExample example = new UserExample();
		example.createCriteria().andUserNameEqualTo(userName);
		List<User> userList = usermapper.selectByExample(example);
		if (userList.size() > 0) {
			return userList.get(0);
		}
		return null;
	}

	@Override
	public User getUserById(Integer id) {
		return usermapper.selectByPrimaryKey(id);
	}

	@Override
	public CommonResult updateTel(String telephone, String authCode, String newtelephone) {
		UserExample example = new UserExample();
		example.createCriteria().andTelphoneEqualTo(telephone);
		List<User> userList = usermapper.selectByExample(example);
		if(userList.size()==0) {
			return CommonResult.failed("该账号不存在");
		}
		if(!vertifyAuthCode(telephone, authCode)) {
			return CommonResult.failed("验证码错误");
		}
		User user = userList.get(0);
		user.setTelphone(newtelephone);
		usermapper.updateByPrimaryKeySelective(user);
		return CommonResult.success(null, "密码修改成功");
	
	}

	@Override
	public CommonResult updatePassword(String telephone, String authCode, String password) {
		  UserExample example = new UserExample();
	        example.createCriteria().andTelphoneEqualTo(telephone);
	        List<User> userList =usermapper.selectByExample(example);
	        if(CollectionUtils.isEmpty(userList)){
	            return CommonResult.failed("该账号不存在");
	        }
	       //验证验证码
	        if(!vertifyAuthCode(authCode,telephone)){
	            return CommonResult.failed("验证码错误");
	        }
	        User user = userList.get(0);
	        user.setPassword(passwordEncoder.encode(password));
	        usermapper.updateByPrimaryKeySelective(user);
	        return CommonResult.success(null,"密码修改成功");
	}

	@Override
	public String refreshToken(String token) {
		return jwtTokenUtil.refreshToken(token);
	}

	@Override
	public CommonResult register(String username, String password,
			String telephone,String authCode) {
		//验证码的确认
		if(!vertifyAuthCode(telephone, authCode)) {
			return CommonResult.failed("验证码错误");
		}
		//用户名的唯一性
		UserExample example = new UserExample();
		example.createCriteria().andUserNameEqualTo(username);
		List<User> userList = usermapper.selectByExample(example);
		if(userList.size()>0) {
			return CommonResult.failed("用户已经存在");
		}
		
		//注册用户信息的添加
		User user = new User();
		user.setUserName(username);
		user.setPassword(passwordEncoder.encode(password));
		user.setReqtime(new Date());
		user.setTelphone(telephone);
		
		//默认信息设置
		
		usermapper.insert(user);//插入记录后取出密码记录
		user.setPassword(null);
		return CommonResult.success(null, "注册成功");
	}

	//选择性修改
	@Override
	public int updateUserByUserId(Integer id, User user) {
		user.setId(id);
		user.setPassword(null);
		return usermapper.updateByPrimaryKeySelective(user);
	}

	/**
	 * 获取当前用户
	 */
	@Override
	public User getCurrentUser() {
		SecurityContext ctx = SecurityContextHolder.getContext();
		Authentication auth = ctx.getAuthentication();
		SecurityUserDetails suser = (SecurityUserDetails)auth.getPrincipal();
		return suser.getuser();
	}

}