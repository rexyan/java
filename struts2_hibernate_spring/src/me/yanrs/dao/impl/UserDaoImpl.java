package me.yanrs.dao.impl;

import me.yanrs.dao.IUserDao;
import me.yanrs.model.User;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class UserDaoImpl implements IUserDao {
    private HibernateTemplate hibernateTemplate;

    // 提供 set 方法，方便 Spring 注入
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void add(User user) {
        hibernateTemplate.save(user);
    }
}
