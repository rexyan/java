package com.yanrs.test;

import me.yanrs.dao.IUserDao;
import me.yanrs.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void TestJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IUserDao userDao = (IUserDao) context.getBean("userDao");

        User user = new User();
        user.setUsername("test3");
        user.setPassword("2222244");

        userDao.add(user);
    }
}
