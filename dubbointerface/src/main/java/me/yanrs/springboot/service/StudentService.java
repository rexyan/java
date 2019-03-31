package me.yanrs.springboot.service;

import me.yanrs.springboot.model.Student;

public interface StudentService {
    public String sayHi(String name);

    public Student getStudent(int id);
}
