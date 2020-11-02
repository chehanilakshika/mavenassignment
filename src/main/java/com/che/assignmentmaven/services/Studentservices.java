package com.che.assignmentmaven.services;

import com.che.assignmentmaven.models.Students;
import com.che.assignmentmaven.repository.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentservices {

    @Autowired
    private Studentrepo repository;

    public Students saveStudent(Students stu ){
        return repository.save(stu);

    }

    public List<Students> saveStudents(List<Students> studs){
        return repository.saveAll(studs);
    }

    public List<Students> getStudents(){
        return repository.findAll();
    }

    public Students getStudent(int studentId){
        return repository.findById(studentId).orElse(null);
    }

    public String deleteStudent(int studentId){
        repository.deleteById(studentId);
        return "product deleted !"+studentId;
    }
}
