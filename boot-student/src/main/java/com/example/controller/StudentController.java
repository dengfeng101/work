package com.example.controller;

import com.example.pojo.Student;
import com.example.returnjson.FindAllJson;
import com.example.returnjson.FindByIdJson;
import com.example.returnjson.StudentJson;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public StudentJson add(@RequestBody Student student){
        StudentJson studentJson=new StudentJson();
        studentJson.setInfo("添加数据");
        studentJson.setDate("失败");
        studentJson.setStatue(200);
        boolean isOk=studentService.add(student);
        if(isOk==true){
            studentJson.setDate("成功");
        }
        return studentJson;
    }
    @DeleteMapping("/{id}")
    public StudentJson del(@PathVariable Integer id){
        StudentJson studentJson=new StudentJson();
        studentJson.setStatue(200);
        studentJson.setInfo("删除数据");
        studentJson.setDate("失败");
        boolean isOk=studentService.del(id);
        if(isOk==true){
            studentJson.setDate("成功");
        }
        return studentJson;
    }
    @PutMapping
    public StudentJson update(@RequestBody Student student){
        StudentJson studentJson=new StudentJson();
        studentJson.setStatue(200);
        studentJson.setInfo("修改数据");
        studentJson.setDate("失败");
        boolean isOk=studentService.update(student);
        if(isOk==true){
            studentJson.setDate("成功");
        }
        return studentJson;
    }
    @GetMapping("/{id}")
    public FindByIdJson findById(@PathVariable Integer id){
        Student student=studentService.findById(id);
        FindByIdJson findByIdJson=new FindByIdJson();
        findByIdJson.setStatue(200);
        findByIdJson.setInfo("查询数据");
        findByIdJson.setStudent(student);
        return findByIdJson;
    }
    @GetMapping ("/findAll")
    public FindAllJson findAll(){
        List<Student> student=studentService.findAll();
        FindAllJson findAllJson=new FindAllJson();
        findAllJson.setInfo("查询所有数据");
        findAllJson.setStatue(200);
        findAllJson.setStudent(student);
        return findAllJson;
    }
}
