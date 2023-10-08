package com.geekster.studentmanagement.service;

import com.geekster.studentmanagement.model.Book;
import com.geekster.studentmanagement.model.Course;
import com.geekster.studentmanagement.repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepo courseRepo;

    public String addCourse(Course newCourse) {
        courseRepo.save(newCourse);
        return "course added";
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public String deleteCourse(Integer id) {
        courseRepo.deleteById(id);
        return "course deleted";
    }

    public String updateCourse(Integer id, Course newCourse) {
        Course course = courseRepo.findById(id).orElseThrow();
        course.setTitle(newCourse.getTitle());
        course.setDescription(newCourse.getDescription());
        course.setDuration(newCourse.getDuration());
        courseRepo.save(course);
        return "course updated";
    }
}
