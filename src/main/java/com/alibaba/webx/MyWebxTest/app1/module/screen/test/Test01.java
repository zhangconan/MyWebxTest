package com.alibaba.webx.MyWebxTest.app1.module.screen.test;

import com.alibaba.citrus.turbine.Context;

/**
 * 
 * @author zkn
 *
 */

public class Test01 {

	public void execute(Context context){
		System.out.println("这是一个测试的案例");
		System.out.println("这是一个新的测试的案例");
		System.out.println("这是一个测试的案例");
		System.out.println("这是一个测试的案例");
		System.out.println("这是一个测试的案例");
		System.out.println("这是一个测试的案例");
		System.out.println("这是一个测试的案例");
		context.put("name", "这是一个测试的案例");
	}
}
