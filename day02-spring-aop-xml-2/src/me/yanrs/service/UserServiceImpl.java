package me.yanrs.service;

public class UserServiceImpl implements IUserService {

    @Override
    public int addUser() {
        System.out.println("新增用户");
        return 1;
    }

    @Override
    public void delUser() {
        System.out.println("删除用户");
    }
}

