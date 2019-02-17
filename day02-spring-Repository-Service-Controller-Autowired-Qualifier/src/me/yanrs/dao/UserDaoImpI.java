package me.yanrs.dao;

import me.yanrs.model.User;
import org.springframework.stereotype.Repository;

@Repository("myRepository")
public class UserDaoImpI implements IUserDao{
    @Override
    public void add(User user) {
        System.out.println("dao 层添加用户");
    }
}
