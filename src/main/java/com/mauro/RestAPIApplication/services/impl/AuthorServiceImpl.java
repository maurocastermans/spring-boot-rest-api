package com.mauro.RestAPIApplication.services.impl;

import com.mauro.RestAPIApplication.domain.entities.AuthorEntity;
import com.mauro.RestAPIApplication.repositories.AuthorRepository;
import com.mauro.RestAPIApplication.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }
}
