package me.yanrs.service;

public interface IAccountService {
    // 转账
    public void transfer(String outer, String inner, Integer money);
}
