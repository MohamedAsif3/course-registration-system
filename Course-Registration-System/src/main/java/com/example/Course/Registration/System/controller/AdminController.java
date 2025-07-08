package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.model.Users;
import com.example.Course.Registration.System.service.CourseService;
import com.example.Course.Registration.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    UserService userService;
    @Autowired
    CourseService courseService;

    @PostMapping("add-user")
    public void addUser(@RequestBody Users user){
        userService.addUser(user);
    }

    @GetMapping("courses-enrolled")
    public List<CourseRegistry> studentsEnrolled(){
        return courseService.studentEnrolled();
    }

    @PutMapping("courses/enrolled")
    public String updateStudents(@RequestBody CourseRegistry courseRegistry){
        courseService.updateStudents(courseRegistry);
        return "Students data Updated";
    }
}
