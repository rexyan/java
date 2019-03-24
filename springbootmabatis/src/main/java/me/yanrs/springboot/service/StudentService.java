package me.yanrs.springboot.service;

import me.yanrs.springboot.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();

    public int update();
}
