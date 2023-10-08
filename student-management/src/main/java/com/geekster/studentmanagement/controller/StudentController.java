package com.geekster.studentmanagement.controller;

import com.geekster.studentmanagement.model.Student;
import com.geekster.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student newStudent) {
        return studentService.addStudent(newStudent);
    }

    @GetMapping("students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("student/{id}")
    public String updateStudent(@PathVariable Integer id, @RequestBody Student newStudent) {
        return studentService.updateStudent(id,newStudent);
    }

    @DeleteMapping("student/id/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        return studentService.deleteStudent(id);
    }


}
