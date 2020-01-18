package com.qltmall.mvc.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import com.qltmall.mvc.common.api.CommonResult;
import com.qltmall.mvc.mbg.model.User;

/**
 * 用户管理接口
 * 
 * @author 32122
 *
 */
public interface UserService {

	/**
	 * 登陆后获得token
	 */
	String login(String username, String password);

	/**
	 * 注册
	 */
	@Transactional
	CommonResult register(String username,String telephone,String authCode,String password);
	/**
	 * 得到用户信息 1.登陆 2、查询
	 */
	User getUserByuserName(String userName);

	User getUserById(Integer id);

	/**
	 * 发送验证码
	 */
	CommonResult generateAuthCode(String telephone);


	/**
	 * 手机绑定修改,0修改失败，1修改成功
	 */
	@Transactional
	CommonResult updateTel(String telephone, String authCode, String newtelephone);


	/**
	 * 修改用户信息
	 */
	
	int updateUserByUserId(Integer id,User user);
	/**
	 * 修改密码
	 */
	@Transactional
	CommonResult updatePassword(String telephone, String authCode, String password);

	/**
	 * 刷新token
	 */
	String refreshToken(String token);
	
      User getCurrentUser();
	
}
