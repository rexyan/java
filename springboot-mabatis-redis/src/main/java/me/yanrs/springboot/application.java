package me.yanrs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement  // 开启 Spring Boot 事务的支持
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }
}
