package com.yanrs.test;

import me.yanrs.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestSpring2 {

    @Test
    public void test1(){
       /*
       装配 Bean 的三种方式
       */

       // 方式1 获取对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService1 = (UserServiceImpl) context.getBean("userService1");
        userService1.add();

       // 方式2 通过静态工厂获取对象
        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService2 = (UserServiceImpl) context2.getBean("userService2");
        userService2.add();
        // 如果出现错误 java.lang.IllegalArgumentException，因为我们的 spring的版本过低，把jdk改成1.7  即可运行,或者使用高版本 Spring

        // 方式3 通过实例工厂方法
        ApplicationContext context3 = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService3 = (UserServiceImpl) context3.getBean("userService3");
        userService3.add();
        // 如果出现错误 java.lang.IllegalArgumentException，因为我们的 spring的版本过低，把jdk改成1.7  即可运行,或者使用高版本 Spring

    }
}
