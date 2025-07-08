package com.example.Course.Registration.System.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CourseRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String emailId;
    private String courseName;


    public CourseRegistry(String courseName, String emailId, String name) {
        this.courseName = courseName;
        this.emailId = emailId;
        this.name = name;
    }
    public CourseRegistry(){

    }
}
