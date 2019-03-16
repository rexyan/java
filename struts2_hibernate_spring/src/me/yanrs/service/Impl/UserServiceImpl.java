package me.yanrs.service.Impl;


import me.yanrs.dao.IUserDao;
import me.yanrs.model.User;
import me.yanrs.service.IUserService;

public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    // 提供 set 方法，方便 Spring 注入
    public void setiUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        userDao.add(user);
    }
}
