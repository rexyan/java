package me.yanrs.test;

import me.yanrs.model.User;
import me.yanrs.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class) // 表明是 Spring 的测试
@ContextConfiguration(locations = "classpath:applicationContext.xml") // 指定 Spring 配置文件的路径
public class Demo {
    // Spring 根据类型注入
    @Autowired
    private IUserService userService;

    @Test
    public void test1(){
        // 保存用户
        User user = new User("test", "123", 20);
        userService.register(user);
    }
}
