package com.qltmall.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qltmall.mvc.common.api.CommonResult;
import com.qltmall.mvc.mbg.model.UserAddress;
import com.qltmall.mvc.service.UserAddressService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//地址不多，就不同分页列表了
@Controller
@Api(tags = "UserAddressController",description = "用户收货地址管理")
@RequestMapping("/user/address")
public class UserAddressController {

	@Autowired
	private UserAddressService useraddressservice;
	
	@ApiOperation("添加地址")
	@PostMapping("/add")
	@ResponseBody
	CommonResult add(@RequestBody  UserAddress useraddress) {
		int count = useraddressservice.add(useraddress);
		if(count==1) {
			return CommonResult.success(useraddress, "添加成功");
		}else {
			return CommonResult.failed("添加失败");
		}
	}
	
	@ApiOperation("删除地址")
	@PostMapping("/delete/{id}")
	@ResponseBody
	CommonResult delete(@PathVariable Integer id) {
		int count = useraddressservice.delete(id);
		if(count==1) {
			return CommonResult.success("删除成功");
		}else {
			return CommonResult.failed("删除失败");
		}
	}
	
	@ApiOperation("修改地址")
	@PostMapping("/update/{id}")
	@ResponseBody
	CommonResult update(@PathVariable Integer id,
			             @RequestBody UserAddress useraddress) {
		int count = useraddressservice.updateUserAddress(id, useraddress);
		if(count==1) {
			return CommonResult.success("修改成功");
		}else {
			return CommonResult.failed("修改失败");
		}
		
		
	}
	
	
	@ApiOperation("显示所有地址")
	@PostMapping("/showUserAddresses")
	@ResponseBody
	CommonResult showUserAddresses() {
		List<UserAddress> useraddresses = useraddressservice.showUserAddresses();
		return CommonResult.success(useraddresses, "所有信息");
	}
	
	@ApiOperation("显示单个地址")
	@PostMapping("/showUserAddress/{id}")
	@ResponseBody
	CommonResult showUserAddresses(@PathVariable Integer id) {
		UserAddress useraddress = useraddressservice.showUserAddress(id);
		return CommonResult.success(useraddress);
	}
	
}
