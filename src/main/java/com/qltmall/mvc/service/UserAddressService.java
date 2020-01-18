package com.qltmall.mvc.service;

import java.util.List;

import com.qltmall.mvc.mbg.model.UserAddress;

/**
 * 添加
 * 修改
 * 删除
 *按照用户id获得全部信息
 */
public interface UserAddressService {
	/**
	 * 添加收货地址
	 */
	int add(UserAddress useraddress);
	/**
	 * 删除收货地址
	 */
	int delete(Integer id);
	/**
	 * 展示所有收货地址
	 */
	List<UserAddress> showUserAddresses();
	/**
	 * 展示单个收货地址
	 */
	UserAddress showUserAddress(Integer id);
	/**
	 * 修改收货地址
	 */
	int updateUserAddress(Integer id,UserAddress useraddress);

}
