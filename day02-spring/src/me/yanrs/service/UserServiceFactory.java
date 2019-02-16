package me.yanrs.service;

public class UserServiceFactory {
    // 创建一个静态工厂方法
    public static UserServiceImpl CreateUserServiceFactory(){
        return new UserServiceImpl();
    }
}
