package com.yanrs.test;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestSpring {
    @Test
    public void TestJdbcTemplate() {
        // 1. 创建数据源
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql:///spring_day02?useUnicode=true&characterEncoding=utf8");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("123456");

        //2. 创建 JdbcTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate(basicDataSource);

        jdbcTemplate.update("update t_user set username = ? where id = ?", "zzz", "1");
    }
}
