package com.bilel.school;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/v1/schools")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;


    @PostMapping("/saveSchool")
    @ResponseStatus(HttpStatus.CREATED)
    public School saveSchool(School school){
        return schoolService.saveSchool(school);
    }

    @GetMapping("/findAllSchools")
    @ResponseStatus(HttpStatus.OK)
    public List<School> findAllStudents(){
        return schoolService.findAll();
    }
}
