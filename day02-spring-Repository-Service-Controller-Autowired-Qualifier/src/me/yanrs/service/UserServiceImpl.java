package me.yanrs.service;

import me.yanrs.dao.IUserDao;
import me.yanrs.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("myUserService")
public class UserServiceImpl implements IUserService {
    @Autowired  // Spring 会自动按照类型注入 userDao 赋值
    @Qualifier("myRepository") // 指定 id 注入 userDao 赋值
    private IUserDao userDao;

    @Override
    public void add() {
        System.out.println("创建用户");
    }

    @Override
    public void add(User user) {
        System.out.println("service 调用 dao 添加用户");
        userDao.add(user);
    }
}

