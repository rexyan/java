package me.yanrs.springboot.model.impl;

import me.yanrs.springboot.mapper.StudentMapper;
import me.yanrs.springboot.model.Student;
import me.yanrs.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    // 这里去和生成的 mapper 接口进行关联，这里需要注意的是，若要 Autowired 成功，需要为 StudentMapper 加上 Mapper 注解
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudent() {
        return studentMapper.selectAllStudent();
    }
}
