package com.test;

import com.model.User;
import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserTest {
    @Autowired
    UserService userService;
    @org.junit.Test //导包错误，一定报错，是此包下的test方法
    public void login(){
        User user=new User();
        user.setUsername("feng1997");
        user.setPassword("m123");
        User user1=new User();
        user1=userService.login(user);
        System.out.println(user1);
    }

    @Test
    public void show(){
        System.out.println("a");
    }
}