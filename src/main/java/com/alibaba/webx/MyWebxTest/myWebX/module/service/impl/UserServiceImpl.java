package com.alibaba.webx.MyWebxTest.myWebX.module.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.webx.MyWebxTest.myWebX.module.dao.UserDao;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.UserDO;
import com.alibaba.webx.MyWebxTest.myWebX.module.service.UserService;

/**
 * 服务层实现类
 * @author zkn
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	/**
	 * 向user表里插入数据
	 */
	@Override
	public int insertUser(UserDO userDo) {
		
		return userDao.insertUser(userDo);
	}

	@Override
	public UserDO getUserInfo(int id) {

		return userDao.getUserInfo(id);
	}
	@Override
	public UserDO getuserMuliTest(int id) {

		return userDao.getuserMuliTest(id);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
