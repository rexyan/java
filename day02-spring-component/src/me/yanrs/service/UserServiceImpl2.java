package me.yanrs.service;

import me.yanrs.model.User;
import org.springframework.stereotype.Component;

@Component("UserService") // @component("UserService") 相当于 <bean class="" id="UserService">
public class UserServiceImpl2 implements IUserService {
    @Override
    public void add() {
        System.out.println("创建用户");
    }

    @Override
    public void add(User user) {
        System.out.println("添加用户");
    }
}

