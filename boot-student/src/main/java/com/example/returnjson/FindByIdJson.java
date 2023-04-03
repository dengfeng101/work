package com.example.returnjson;

import com.example.pojo.Student;
import lombok.Data;

@Data
public class FindByIdJson {
    private Integer statue;
    private String info;
    private Student student;
}
