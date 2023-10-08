package com.geekster.studentmanagement.service;

import com.geekster.studentmanagement.model.Address;
import com.geekster.studentmanagement.model.Book;
import com.geekster.studentmanagement.repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo;

    public String addBook(Book newBook) {
        bookRepo.save(newBook);
        return "book added";
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public String updateBook(Integer id, Book newBook) {
        Book book = bookRepo.findById(id).orElseThrow();
        book.setTitle(newBook.getTitle());
        book.setAuthor(newBook.getAuthor());
        book.setDescription(newBook.getDescription());
        book.setPrice(newBook.getPrice());
        bookRepo.save(book);
        return "book updated";
    }

    public String deleteBook(Integer id) {
        bookRepo.deleteById(id);
        return "book deleted";
    }
}
