package com.mapping.demo.controllers;

import com.mapping.demo.respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

        @GetMapping("/student")
        public void getStudents(){
            studentRepository.findAllPspAndName();
        }
}

