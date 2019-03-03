package com.yanrs.test;


import me.yanrs.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        userService.addUser();
        /*
        Around 前置通知
        方法名称 addUser
        前置通知
        新增用户
        Around 后置通知
        最终通知addUser
        方法名称 addUser
        后置通知
        后置通知接收到的返回值：1
         */
    }
}
