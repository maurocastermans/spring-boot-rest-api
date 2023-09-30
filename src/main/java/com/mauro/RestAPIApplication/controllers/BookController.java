package com.mauro.RestAPIApplication.controllers;

import com.mauro.RestAPIApplication.domain.dto.AuthorDto;
import com.mauro.RestAPIApplication.domain.dto.BookDto;
import com.mauro.RestAPIApplication.domain.entities.AuthorEntity;
import com.mauro.RestAPIApplication.domain.entities.BookEntity;
import com.mauro.RestAPIApplication.mappers.Mapper;
import com.mauro.RestAPIApplication.services.AuthorService;
import com.mauro.RestAPIApplication.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    private final BookService bookService;

    private Mapper<BookEntity, BookDto> bookMapper;

    public BookController(Mapper<BookEntity, BookDto> bookMapper, BookService bookService) {
        this.bookMapper = bookMapper;
        this.bookService = bookService;
    }

    @PutMapping(path = "/books/{isbn}")
    public ResponseEntity<BookDto> createBook(@PathVariable("isbn") String isbn, @RequestBody BookDto bookDto) {
        BookEntity bookEntity = bookMapper.mapFrom(bookDto);
        BookEntity savedBookEntity = bookService.createBook(isbn, bookEntity);
        return new ResponseEntity<>(bookMapper.mapTo(savedBookEntity), HttpStatus.CREATED);


    }
}