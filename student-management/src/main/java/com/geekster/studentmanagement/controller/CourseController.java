package com.geekster.studentmanagement.controller;


import com.geekster.studentmanagement.model.Book;
import com.geekster.studentmanagement.model.Course;
import com.geekster.studentmanagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public String addCourse(@RequestBody Course newCourse) {
        return courseService.addCourse(newCourse);
    }

    @GetMapping("courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PutMapping("/{id}")
    public String updateCourse(@PathVariable Integer id, @RequestBody Course newCourse) {
        return courseService.updateCourse(id, newCourse);
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable Integer id) {
        return courseService.deleteCourse(id);
    }
}
