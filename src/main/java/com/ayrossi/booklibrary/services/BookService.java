package com.ayrossi.booklibrary.services;

import com.ayrossi.booklibrary.entities.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {

    List<Book> getAllBooks();

    Book createBook(Book book);
}
