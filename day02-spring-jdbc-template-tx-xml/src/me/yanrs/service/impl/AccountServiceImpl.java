package me.yanrs.service.impl;

import me.yanrs.dao.IAccountDao;
import me.yanrs.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inner, Integer money) {

        // 扣钱
        accountDao.out(outer, money);

        // 收钱
        accountDao.in(inner, money);
    }
}
