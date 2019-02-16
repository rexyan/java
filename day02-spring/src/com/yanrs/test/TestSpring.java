package com.yanrs.test;

import me.yanrs.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestSpring {

    @Test
    public void test1(){
       /*
       Spring 加载容器的三种方式
       */

        // 1. 第一种 ClassPathXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
        userService.add();

        // 第二种 FileSystemXmlApplicationContext
        ApplicationContext context1 = new FileSystemXmlApplicationContext("/Users/rex/IdeaProjects/day02-spring/src/beans.xml");
        UserServiceImpl userService1 = (UserServiceImpl) context1.getBean("userService");
        userService1.add();

        // 第三种
        String path = "/Users/rex/IdeaProjects/day02-spring/src/beans.xml";
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource(path));
        UserServiceImpl userService2 = (UserServiceImpl) beanFactory.getBean("userService");
        userService2.add();
    }
}
