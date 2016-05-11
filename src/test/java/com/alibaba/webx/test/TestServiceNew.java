package com.alibaba.webx.test;
import com.alibaba.webx.MyWebxTest.myWebX.module.dao.object.UserDO;
import com.alibaba.webx.MyWebxTest.myWebX.module.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Spring单元测试类
 * Created by wb-zhangkenan on 2016/4/8.
 * @RunWith 启用Spring测试类
 * @ContextConfiguration("")文件位置
 * @Transactional 启用事务
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/com/alibaba/webx/test/biz-bean.xml")
@Transactional
public class TestServiceNew extends BaseTest {
    /**
     * 自动装配
     */
    @Autowired
    private UserService userService;
    @Test
    public void testGetService(){

        UserDO user = userService.getUserInfo(2);
        System.out.println(user.getUserName()+user.getPassWord());

        UserDO userDO = userService.getuserMuliTest(2);
        System.out.println(userDO.getUserMuli().size());

    }
}
