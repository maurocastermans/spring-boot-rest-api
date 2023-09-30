package com.mauro.RestAPIApplication.services.impl;

import com.mauro.RestAPIApplication.domain.entities.BookEntity;
import com.mauro.RestAPIApplication.repositories.BookRepository;
import com.mauro.RestAPIApplication.services.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createBook(String isbn, BookEntity book) {
        book.setIsbn(isbn); // Book always has isbn of URL, body overwritten
        return bookRepository.save(book);
    }
}
