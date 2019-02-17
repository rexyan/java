package com.yanrs.test;

import me.yanrs.model.Programmer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Programmer programmer = (Programmer) context.getBean("pro");

        System.out.println(programmer.getCars());
        System.out.println(programmer.getPats());
        System.out.println(programmer.getInfos());
        System.out.println(programmer.getMysqlContentInfos());
        System.out.println(programmer.getMembers());
        for (String mem: programmer.getMembers()) {
            System.out.println(mem);
        }

        /*
        [宝马, ofo]
        [猫, 狗]
        {姓名=test, ip=127.0.0.1}
        {user=root, url=mysql:jdbc///localhost:3306/dbname, password=12345}
        [Ljava.lang.String;@2eff024d
        父亲
        母亲
        姐姐
         */
    }
}
