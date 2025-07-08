package com.example.Course.Registration.System.controller;


import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {


    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }


    @PostMapping("courses/register")
    public String enrollCourse(@RequestParam("courseName") String courseName,
                               @RequestParam("emailId") String emailId,
                               @RequestParam("name") String name){
        courseService.enrollCourse(name,emailId,courseName);
        return "Congratulations! " +name+ " Enrollment successful for "+ courseName;
    }

    @GetMapping("/")
    public String home(){
        return "Home page!";
    }



}
