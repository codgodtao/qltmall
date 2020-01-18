package com.qltmall.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qltmall.mvc.common.api.CommonResult;
import com.qltmall.mvc.mbg.mapper.UserMapper;
import com.qltmall.mvc.mbg.model.User;
import com.qltmall.mvc.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 用户登录注册，信息修改
 */
@Controller
@Api(tags = "UserController", description = " 用户登录注册管理")
@RequestMapping("/user")
public class UserController {
	@Value("${jwt.tokenHeader}")
	private String tokenHeader;
	@Value("${jwt.tokenHead}")
	private String tokenHead;
	@Autowired
	private UserService userservice;

	@ApiOperation("用户注册")
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult register(@RequestParam String username, @RequestParam String password,
			@RequestParam String telephone, @RequestParam String authCode) {
		return userservice.register(username, password, telephone, authCode);
	}

	@ApiOperation("用户登录")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult login(@RequestParam String username, @RequestParam String password) {
		String token = userservice.login(username, password);
		if (token == null) {
			return CommonResult.validateFailed("用户名或密码错误");
		}
		Map<String, String> tokenMap = new HashMap<>();
		tokenMap.put("token", token);
		tokenMap.put("tokenHead", tokenHead);
		return CommonResult.success(tokenMap);
	}

	@ApiOperation("获取验证码")
	@RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
	@ResponseBody
	public CommonResult getAuthCode(@RequestParam String telephone) {
		return userservice.generateAuthCode(telephone);
	}

	@ApiOperation("修改密码")
	@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult updatePassword(@RequestParam String telephone, @RequestParam String password,
			@RequestParam String authCode) {
		return userservice.updatePassword(telephone, password, authCode);
	}

	@ApiOperation("更改手机绑定")
	@PostMapping("/updateTel")
	@ResponseBody
	public CommonResult updateTel(
			@RequestParam String telephone,
			@RequestParam String authCode,
			@RequestParam String newtelephone) {
		return userservice.updateTel(telephone, authCode, newtelephone);		
	}

	@ApiOperation(value = "刷新token")
	@RequestMapping(value = "/refreshToken", method = RequestMethod.GET)
	@ResponseBody
	public CommonResult refreshToken(HttpServletRequest request) {
		String token = request.getHeader(tokenHeader);
		String refreshToken = userservice.refreshToken(token);
		if (refreshToken == null) {
			return CommonResult.failed("token已经过期！");
		}
		Map<String, String> tokenMap = new HashMap<>();
		tokenMap.put("token", refreshToken);
		tokenMap.put("tokenHead", tokenHead);
		return CommonResult.success(tokenMap);
	}

	/**
	 * 
	 */
	@ApiOperation(value="根据id修改用户信息")
	@PostMapping(value="/updateUserById/{id}")
	@ResponseBody
	public CommonResult updateUserById(
			@PathVariable  Integer id,
			@RequestBody  User user) {
		int count = userservice.updateUserByUserId(id, user);
		if(count==1) {
			return CommonResult.success(user, "修改成功");
		}else {
			return CommonResult.failed("修改失败");
		}
	}

    @ApiOperation(value = "获取当前用户信息")
    @RequestMapping(value = "/getCurrentUser", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getCurrentUser() {
    	User user = userservice.getCurrentUser();
        return CommonResult.success(user,"获取信息成功");
    }

	
}
