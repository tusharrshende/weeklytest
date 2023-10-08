package com.geekster.studentmanagement.repo;

import com.geekster.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,Integer> {
}
