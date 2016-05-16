package com.alibaba.webx.MyWebxTest.myWebX.module.service;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * 主服务类
 * @author zkn
 *
 */
public class MainService {

	/**
	 * 用户服务类
	 */
	@Autowired
	private UserService userService;
	/**
	 * 地址服务类
	 */
	@Autowired
	private AddressService addressService;
	
	public UserService getUserService() {
		return userService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public AddressService getAddressService() {
		return addressService;
	}
	
	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	} 
	
}
