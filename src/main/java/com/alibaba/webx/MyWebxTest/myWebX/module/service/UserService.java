package com.alibaba.webx.MyWebxTest.myWebX.module.service;

import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.UserDO;

/**
 * 服务层接口
 * @author zkn
 *
 */

public interface UserService {

	/**
	 * 向user表插入数据
	 * @param userDo
	 * @return
	 */
	public int insertUser(UserDO userDo);
	/**
	 * 获取表中的信息
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
