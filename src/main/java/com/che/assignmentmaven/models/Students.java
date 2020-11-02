package com.che.assignmentmaven.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@Entity
@Table(name="STUDENT_TBL")
public class Students {

    @Id
    @GeneratedValue
    private int studentId;
    private String firstName;
    private String lastName;
    private String department;
    private String gender;
    private String address;

}
