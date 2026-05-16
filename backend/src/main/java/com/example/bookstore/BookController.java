package com.example.bookstore;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBooks() {

        List<Book> books = new ArrayList<>();

        books.add(new Book(
                1,
                "Java Basics",
                "James",
                499
        ));

        books.add(new Book(
                2,
                "Spring Boot",
                "Rod",
                699
        ));

        books.add(new Book(
                3,
                "HTML CSS JS",
                "John",
                399
        ));

        return books;
    }
}