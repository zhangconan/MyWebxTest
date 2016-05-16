package com.alibaba.webx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wb-zhangkenan on 2016/4/8.
 */
public class BaseTest {
    public  static ApplicationContext applicationContext;
    public ApplicationContext initAppCon(){
        applicationContext = new ClassPathXmlApplicationContext("com/alibaba/webx/test/biz-bean.xml");
        return applicationContext;
    }
}
