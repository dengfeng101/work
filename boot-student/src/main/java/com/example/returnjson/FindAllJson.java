package com.example.returnjson;

import com.example.pojo.Student;
import lombok.Data;

import java.util.List;
@Data
public class FindAllJson {
    private int statue;
    private String info;
    private List<Student> student;
}
