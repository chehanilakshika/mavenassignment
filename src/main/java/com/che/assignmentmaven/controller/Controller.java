package com.che.assignmentmaven.controller;

import com.che.assignmentmaven.services.Studentservices;

import com.che.assignmentmaven.models.Students;
import com.che.assignmentmaven.repository.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Controller {
    @Autowired
    private Studentservices services;

    @PostMapping("/addStudent")
    public Students addStudent(@RequestBody Students student){
        System.out.println(student);
        return services.saveStudent(student);

    }

    @PostMapping("/addStudents")
    public List<Students> addStudents(@RequestBody List<Students> students){
        return services.saveStudents(students);

    }

    @GetMapping("/getStudents")
    public List<Students> getStudents(){
        return services.getStudents();

    }

    @GetMapping("/getStudentById/{studentId}")
    public Students getStudentById(@PathVariable int studentId){
        return services.getStudent(studentId);

    }

    @DeleteMapping("/deleteById/{studentId}")
    public String deleteById(@PathVariable int studentId){
        return services.deleteStudent(studentId);

    }




}
