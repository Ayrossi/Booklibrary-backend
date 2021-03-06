package com.ayrossi.booklibrary.services;

import com.ayrossi.booklibrary.entities.Book;
import com.ayrossi.booklibrary.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    public final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(long id) {
        return  bookRepository.findById(id).get();
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book modifyBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public long deleteBook(long id) {
        bookRepository.deleteById(id);
        return id;
    }
}
