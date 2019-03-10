package me.yanrs.dao.impl;

import me.yanrs.dao.IAccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

@Transactional
//这样写代表使用了默认的参数，即 (propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
// 且类中的所有方法都会走事务，如果只想让某个方法走事务，那么只需在那个方法上加上 @Transactional 即可
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
