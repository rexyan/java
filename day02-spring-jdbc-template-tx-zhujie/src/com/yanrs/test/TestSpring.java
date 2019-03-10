package com.yanrs.test;
import me.yanrs.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    @Test
    public void TestAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IAccountService accountService = (IAccountService) context.getBean("accountService");

        accountService.transfer("jack", "rose", 100);
    }
}
