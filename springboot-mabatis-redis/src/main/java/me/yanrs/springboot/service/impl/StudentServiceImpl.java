package me.yanrs.springboot.service.impl;

import me.yanrs.springboot.mapper.StudentMapper;
import me.yanrs.springboot.model.Student;
import me.yanrs.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    // 创建一个 Redis 序列化器，用来让 key 看起来是字符串。
    StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
    // 注入 Spring boot 配置好的 Redis 模版
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;
    @Override
    public List<Student> getAllStudent() {
        // 将 key 序列化
        redisTemplate.setKeySerializer(stringRedisSerializer);
        // 查询缓存，key 为 allStudents
        List<Student> studentList = (List<Student>) redisTemplate.opsForValue().get("allStudents");
        if (studentList == null){
            // 如果没有缓存，那么查询数据库
            studentList = studentMapper.selectAllStudent();
            // 且将查询的结果放入 Redis 中
            redisTemplate.opsForValue().set("allStudents", studentList);
        }
        return studentList;
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
