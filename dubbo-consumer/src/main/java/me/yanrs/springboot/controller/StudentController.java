package me.yanrs.springboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import me.yanrs.springboot.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Reference(version = "1.0.0") // 注意这里的版本要和提供者的一致
    private StudentService studentService;

    @RequestMapping("/boot/student")
    public Object getStudent(@RequestParam("id") Integer id){
        return studentService.getStudent(id);
    }

    @RequestMapping("/boot/sayhi")
    public Object sayHi(@RequestParam("name") String name){
        return studentService.sayHi(name);
    }
}
