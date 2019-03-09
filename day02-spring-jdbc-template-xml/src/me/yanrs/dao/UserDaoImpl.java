package me.yanrs.dao;

import me.yanrs.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void add(User user) {
        System.out.println("新增用户" + user);
        jdbcTemplate.update("insert t_user (username, password) values  (?, ?)", user.getUsername(), user.getPassword());
    }
}
