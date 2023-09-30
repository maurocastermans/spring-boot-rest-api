package com.mauro.RestAPIApplication.services;

import com.mauro.RestAPIApplication.domain.dto.BookDto;
import com.mauro.RestAPIApplication.domain.entities.BookEntity;

public interface BookService {

    BookEntity createBook(String isbn, BookEntity book);
}
