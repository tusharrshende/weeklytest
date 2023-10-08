package com.geekster.studentmanagement.controller;

import com.geekster.studentmanagement.model.Address;
import com.geekster.studentmanagement.model.Book;
import com.geekster.studentmanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("book")
    public String addBook(@RequestBody Book newBook) {
        return bookService.addBook(newBook);
    }

    @GetMapping("books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable Integer id, @RequestBody Book newBook) {
        return bookService.updateBook(id, newBook);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Integer id) {
        return bookService.deleteBook(id);
    }
}
