package com.example.service.impl;

import com.example.mapper.StudentMapper;
import com.example.pojo.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Boolean add(Student student) {
        int row=studentMapper.add(student);
        return row>0;
    }

    @Override
    public Boolean del(Integer id) {
        int row=studentMapper.del(id);
        return row>0;
    }

    @Override
    public Boolean update(Student student) {
        int row=studentMapper.update(student);
        return row>0;
    }

    @Override
    public Student findById(Integer id) {
        return studentMapper.findById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
