package com.murali.springboot.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murali.springboot.course.bean.Course;

/**
 * @author:Sanapala Muralidharan
 * @date:Jan 6, 2022 11:37:13 AM
 * @version:2.x
 */
@RestController
public class CourseController {

    // http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
	return Arrays.asList(new Course(1, "Learn Microservices", "Springboot"));

    }
}
