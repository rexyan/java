package me.yanrs.service;

/*
实现接口，重写 add 方法
 */
public class UserServiceImpl implements IUserService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add() {
        System.out.println("创建用户" + name);
    }
}
