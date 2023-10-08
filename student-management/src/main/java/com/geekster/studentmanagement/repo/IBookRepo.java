package com.geekster.studentmanagement.repo;

import com.geekster.studentmanagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,Integer> {
}
