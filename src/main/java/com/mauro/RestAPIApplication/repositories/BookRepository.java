package com.mauro.RestAPIApplication.repositories;

import com.mauro.RestAPIApplication.domain.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Long> {
}