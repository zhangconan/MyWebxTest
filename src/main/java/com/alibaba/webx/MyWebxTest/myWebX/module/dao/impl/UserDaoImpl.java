package com.alibaba.webx.MyWebxTest.myWebX.module.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;

import com.alibaba.webx.MyWebxTest.myWebX.module.dao.UserDao;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.UserDO;

/**
 * DAO实现层
 * @author zkn
 *
 */

public class UserDaoImpl extends AbstractDao implements UserDao{

	/**
	 * 向user表里插入数据
	 */
	@Override
	public int insertUser(UserDO userDo) {
		
		return getSqlSession().insert("userMapper.insertUser", userDo);
	}

	@Override
	public UserDO getUserInfo(int id) {
		return getSqlSession().selectOne("userMapper.getUserInfo",id);
	}

}
