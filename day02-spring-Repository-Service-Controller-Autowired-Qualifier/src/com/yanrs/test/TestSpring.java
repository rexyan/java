package com.yanrs.test;

import me.yanrs.action.UserAction;
import me.yanrs.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserAction action = (UserAction) context.getBean("myController");

        User user = new User();
        user.setName("zhangsan");
        action.save(user);
    }
}
