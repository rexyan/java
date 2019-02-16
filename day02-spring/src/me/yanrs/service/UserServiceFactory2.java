package me.yanrs.service;

public class UserServiceFactory2 {
    // 创建一个实例工厂方法
    public UserServiceImpl CreateUserServiceFactory(){
        return new UserServiceImpl();
    }
}
