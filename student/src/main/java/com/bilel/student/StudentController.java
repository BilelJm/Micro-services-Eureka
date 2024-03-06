package com.bilel.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/saveStudent")
    @ResponseStatus(HttpStatus.CREATED)
    public Student saveStudent(Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/findAllStudents")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> findAllStudents(){
        return studentService.findAll();
    }
}
