package com.ayrossi.booklibrary.controllers;


import com.ayrossi.booklibrary.entities.Book;
import com.ayrossi.booklibrary.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {


    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return new ResponseEntity(bookService.createBook(book), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity(bookService.getAllBooks(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable long id) {
        return new ResponseEntity(bookService.getBook(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Book> modifyBook(@RequestBody Book book){
        return new ResponseEntity(bookService.modifyBook(book), HttpStatus.OK) ;
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteBook(@PathVariable long id){
        return new ResponseEntity(bookService.deleteBook(id), HttpStatus.OK) ;
    }

}
