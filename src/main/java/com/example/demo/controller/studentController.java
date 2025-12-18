package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.*;

import com.example.demo.entity.*;
import com.example.serivce.studentService;
@RestController


public class studentController {
    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity>getAll(){
        return service.getAll();
    }

    @postMapping("/add")

    public studentEntity addStudent(@Valid @RequestBody studentEntity student){
        return service.addStudent(student);
    }

}