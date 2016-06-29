package com.alibaba.webx.MyWebxTest.myWebX.module.screen;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.turbine.Context;

/**
 * 
 * @author zkn 2016-06-29
 *
 */

public class DownLoadFile {

	@Autowired
	private HttpServletResponse response;
	
	public void execute(Context context){
		System.out.println("张三李四");
		System.out.println("张三李四");
		System.out.println("张三李四");
		context.put("zhangsan", "lisi");
	}
}
