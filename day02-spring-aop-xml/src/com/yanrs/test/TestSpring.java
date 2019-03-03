package com.yanrs.test;

import me.yanrs.model.User;
import me.yanrs.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        userService.addUser();
        /*
        输出内容为，"新增用户"。"新增用户" 是调用 addUser 返回的内容，在调用 addUser 之前和之后可以执行一些操作
        前置通知
        新增用户
        后置通知
         */
    }
}
