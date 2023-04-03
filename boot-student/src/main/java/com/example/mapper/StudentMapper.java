package com.example.mapper;

import com.example.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {
    Integer add(@Param(value = "student0")Student student);
    Integer del(Integer id);
    Integer update(@Param(value = "student1")Student student);
    Student findById(Integer id);

    List<Student> findAll();
}
