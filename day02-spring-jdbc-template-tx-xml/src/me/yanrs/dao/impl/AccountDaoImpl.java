package me.yanrs.dao.impl;

import me.yanrs.dao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    @Override
    public void out(String outer, Integer money) {
        int a = 10/0;
        getJdbcTemplate().update("update account set money = money - ? where username = ?", money, outer);
    }

    @Override
    public void in(String inner, Integer money) {
        getJdbcTemplate().update("update account set money = money + ? where username = ?", money, inner);
    }
}
