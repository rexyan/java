package me.yanrs.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebApplication {

    public static void main(String[] args) {
        // 启动了 Spring boot 程序 （启动 Spring 容器，启动内嵌的 Tomcat）
        SpringApplication.run(SpringWebApplication.class, args);
    }

}
