package me.yanrs.dao;

public interface IAccountDao {
    // 扣钱
    public void out(String outer, Integer money);

    // 收钱
    public void in(String inner, Integer money);
}
