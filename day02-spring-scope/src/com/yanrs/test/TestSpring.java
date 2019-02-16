package com.yanrs.test;

import me.yanrs.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        UserServiceImpl userService2 = (UserServiceImpl) context.getBean("userService");
        System.out.println(userService);
        System.out.println(userService2);

        /*
        当 xml 中 scope="singleton"或者为空时，代表单例模式，输出为：
        me.yanrs.service.UserServiceImpl@1f28c152
        me.yanrs.service.UserServiceImpl@1f28c152

        当 xml 中 scope="prototype"时，代表多例模式，输出为：
        me.yanrs.service.UserServiceImpl@6ddf90b0
        me.yanrs.service.UserServiceImpl@57536d79
         */

    }
}
