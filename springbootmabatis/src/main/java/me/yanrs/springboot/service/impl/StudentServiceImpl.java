package me.yanrs.springboot.service.impl;

import me.yanrs.springboot.mapper.StudentMapper;
import me.yanrs.springboot.model.Student;
import me.yanrs.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional // 开启事务
    @Override
    public int update() {
        Student student = new Student();
        student.setId(1);
        student.setName("test1111");
        student.setAge(90);
        int update = studentMapper.updateByPrimaryKeySelective(student);
        System.out.printf("更新影响条数为：" + update);

        // 制作一个运行异常, 因为上面开启了事务，所以上一步的更新就会回滚。如果关闭了上面的事务，那么将不会回滚
        int a = 10/0;

        return update;
    }
}
