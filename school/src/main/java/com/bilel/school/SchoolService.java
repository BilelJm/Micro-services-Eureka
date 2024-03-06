package com.bilel.school;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    public School saveSchool(School school){
        return schoolRepository.save(school);
    }

    public List<School> findAll(){
        return schoolRepository.findAll();
    }

}
