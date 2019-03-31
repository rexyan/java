package me.yanrs.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import me.yanrs.springboot.mapper.StudentMapper;
import me.yanrs.springboot.model.Student;
import me.yanrs.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0.0", timeout = 10000) // Dubbo 注解
public class UserServerImpl  implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public String sayHi(String name) {
        return "Hi, Spring Boot" + name;
    }

    @Override
    public Student getStudent (int id) {
        // 查询数据库
        return studentMapper.selectByPrimaryKey(id);
    }
}
