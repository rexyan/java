package me.yanrs.dao;

import me.yanrs.model.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements IUserDao{

    @Override
    public void add(User user) {

        System.out.println("新增用户" + user);
        // JdbcDaoSupport 有一个自带的 JdbcTemplate，所以不需要我们在 beans.xml 中配置了
        this.getJdbcTemplate().update("insert t_user (username, password) values  (?, ?)", user.getUsername(), user.getPassword());
    }
}
