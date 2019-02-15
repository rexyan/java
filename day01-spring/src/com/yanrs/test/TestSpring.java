package com.yanrs.test;

import me.yanrs.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void test1(){

        // 从 spring 容器中获取 UserService：
        // 1. 加载 beans.xml 这个 spring 的配置文件
        ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");

        // 2. 从 spring 容器中获取 UserService
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        userService.add();

        /*
        上面是利用 spring，然后在 beans.xml 中配置一个 bean，然后加载 xml 获取 bean 对象。
        而如果不用 spring 的话，那我们要调用 add 方法的话，我们就得创建一个对象，然后再去调用 add 方法
        UserServiceImpl userService1 = new UserServiceImpl();
        userService1.add();
         */
    }
}
