package com.alibaba.webx.MyWebxTest.myWebX.module.dao;

import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.UserDO;

/**
 * DAO层接口
 * @author zkn
 *
 */

public interface UserDao {

	/**
	 * 向user表里插入数据
	 * @param userDo
	 * @return
	 */
	public int insertUser(UserDO userDo);

	/**
	 * 获取用户信息
	 * @param id
	 * @return
     */
	public UserDO getUserInfo(int id);
	/**
	 *测试一对多级联关系
	 * @param id
	 * @return
	 */
	public UserDO getuserMuliTest(int id);
}
