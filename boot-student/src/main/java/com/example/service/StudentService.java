package com.example.service;

import com.example.pojo.Student;
import org.apache.catalina.User;

import java.util.List;

public interface StudentService {
    Boolean add(Student student);
    Boolean del(Integer id);
    Boolean update(Student student);
    Student findById(Integer id);

    List<Student> findAll();
}
