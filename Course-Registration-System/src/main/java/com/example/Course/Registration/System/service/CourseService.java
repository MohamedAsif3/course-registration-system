package com.example.Course.Registration.System.service;


import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.repository.CourseRegistryRepo;
import com.example.Course.Registration.System.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;


    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> studentEnrolled() {
        return courseRegistryRepo.findAll();
    }


    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(courseName,emailId,name);
        courseRegistryRepo.save(courseRegistry);
    }

    public void updateStudents(CourseRegistry courseRegistry) {
        courseRegistryRepo.save(courseRegistry);

    }
}
