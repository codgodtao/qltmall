package com.qltmall.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qltmall.mvc.mbg.mapper.UserAddressMapper;
import com.qltmall.mvc.mbg.model.User;
import com.qltmall.mvc.mbg.model.UserAddress;
import com.qltmall.mvc.mbg.model.UserAddressExample;
import com.qltmall.mvc.mbg.model.UserExample;
import com.qltmall.mvc.service.UserAddressService;
import com.qltmall.mvc.service.UserService;

@Service
public class UserAddressImpl implements UserAddressService {
	
	//selective选择性的，只会修改不为Null的传递参数
	//添加用户的服务类和地址的mapper
	@Autowired
	private UserService userservice;
	@Autowired
	private UserAddressMapper useraddressmapper;

	/**
	 * 1.获取当前用户
	 * 2.为当前用户添加useraddress
	 */
	@Override
	public int add(UserAddress useraddress) {
		User user = userservice.getCurrentUser();
		useraddress.setUserId(user.getId());
		return useraddressmapper.insertSelective(useraddress);
	}

	/**
	 * 直接按照id删除
	 */
	@Override
	public int delete(Integer id) {
		return useraddressmapper.deleteByPrimaryKey(id);
	}

	/**
	 * 1.获取当前用户
	 * 2.获取该用户的地址列表，返回
	 */
	@Override
	public List<UserAddress> showUserAddresses() {
		User user = userservice.getCurrentUser();
		UserAddressExample example = new UserAddressExample();
		example.createCriteria().andUserIdEqualTo(user.getId());
		return useraddressmapper.selectByExample(example);
	}

	@Override
	public UserAddress showUserAddress(Integer id) {
		return useraddressmapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateUserAddress(Integer id, UserAddress useraddress) {
		useraddress.setId(id);
		return useraddressmapper.updateByPrimaryKeySelective(useraddress);
	}

}
