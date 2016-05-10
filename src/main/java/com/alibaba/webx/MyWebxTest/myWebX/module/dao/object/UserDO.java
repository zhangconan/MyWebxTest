package com.alibaba.webx.MyWebxTest.myWebX.module.dao.object;

import java.util.List;

/**
 * 用户VO
 * @author zkn
 *
 */

public class UserDO {

	/**
	 * 姓名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String passWord;
	/**
	 * 用来测试多对一关系
	 */
	private List<UserMuliDo> userMuli;

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public List<UserMuliDo> getUserMuli() {
		return userMuli;
	}

	public void setUserMuli(List<UserMuliDo> userMuli) {
		this.userMuli = userMuli;
	}
}
