package com.yanrs.test;

import me.yanrs.service.UserServiceImpl;
import me.yanrs.service.UserServiceImpl2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 通过类型获取 Bean，因为我们只使用了@Component 注解但是没有设置id
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        System.out.println(userService);

        // 通过id获取 Bean，因为我们使用了 @Component("UserService")
        UserServiceImpl2 userService2 = (UserServiceImpl2) context.getBean("UserService");
        System.out.println(userService2);

    }
}
