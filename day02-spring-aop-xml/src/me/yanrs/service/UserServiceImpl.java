package me.yanrs.service;

public class UserServiceImpl implements IUserService {

    @Override
    public void addUser() {
        System.out.println("新增用户");
    }

    @Override
    public void delUser() {
        System.out.println("删除用户");
    }
}

