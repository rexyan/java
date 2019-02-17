package me.yanrs.service;

/*
实现接口，重写 add 方法
 */
public class UserServiceImpl implements IUserService {
    @Override
    public void add() {
        System.out.println("创建用户");
    }
}
