package com.alibaba.webx.MyWebxTest.myWebX.module.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.UserDO;
import com.alibaba.webx.MyWebxTest.myWebX.module.service.UserService;
/**
 * 注册处理类
 * @author zkn
 *
 */
public class MyregisterAction {

	@Autowired
	private HttpServletRequest request;
	@Autowired
	private HttpServletResponse respone; 
	@Autowired
	private UserService userService; 
	
	public void doRegister(@FormGroup(name="testRegister") UserDO userDo,Context context,Navigator na){
		/**
			Cookie cookied = new Cookie("cookie","dddd");
			respone.addCookie(cookied);
		 */
		System.out.println("用户名："+userDo.getUserName());
		//向user表插入用户数据
		userService.insertUser(userDo);
		na.forwardTo("index");
	}
}
