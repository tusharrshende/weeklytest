package com.geekster.studentmanagement.service;

import com.geekster.studentmanagement.model.Student;
import com.geekster.studentmanagement.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;


    public String addStudent(Student newStudent) {
        studentRepo.save(newStudent);
        return "student added";
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public String deleteStudent(Integer id) {
        studentRepo.deleteById(id);
        return "student deleted";
    }

    public String updateStudent(Integer id, Student newStudent) {
        Student student = studentRepo.findById(id).orElseThrow();
        student.setStudentName(newStudent.getStudentName());
        student.setAge(newStudent.getAge());
        student.setPhoneNumber((newStudent.getPhoneNumber()));
        student.setBranch(newStudent.getBranch());
        student.setDepartment(newStudent.getDepartment());
        studentRepo.save(newStudent);
        return "student update";
    }
}
