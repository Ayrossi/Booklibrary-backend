package com.ayrossi.booklibrary.services;

import com.ayrossi.booklibrary.entities.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {

    List<Book> getAllBooks();

    Book getBook(long id);

    Book createBook(Book book);

    Book modifyBook(Book book);

    long deleteBook(long id);
}
