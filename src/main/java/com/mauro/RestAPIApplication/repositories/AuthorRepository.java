package com.mauro.RestAPIApplication.repositories;

import com.mauro.RestAPIApplication.domain.entities.AuthorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity, Long> {
}
