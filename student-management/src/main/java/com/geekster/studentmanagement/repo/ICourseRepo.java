package com.geekster.studentmanagement.repo;

import com.geekster.studentmanagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Integer> {
}
