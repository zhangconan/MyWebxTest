package com.alibaba.webx.test;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.UserDO;
import com.alibaba.webx.MyWebxTest.myWebX.module.service.UserService;
import org.junit.Test;
/**
 * Created by wb-zhangkenan on 2016/4/8.
 */
public class TestService extends BaseTest {
    @Test
    public void testGetService(){
        UserService userService = (UserService) initAppCon().getBean("userService");
        UserDO user = userService.getUserInfo(2);
        System.out.println(user.getUserName()+user.getPassWord());
    }
}
