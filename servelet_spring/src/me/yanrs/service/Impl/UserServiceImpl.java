package me.yanrs.service.Impl;

import me.yanrs.service.IUserService;

public class UserServiceImpl implements IUserService {
    @Override
    public void add(String username) {
        System.out.println("添加用户成功");
    }
}
