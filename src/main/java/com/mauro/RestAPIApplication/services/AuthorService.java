package com.mauro.RestAPIApplication.services;

import com.mauro.RestAPIApplication.domain.dto.AuthorDto;
import com.mauro.RestAPIApplication.domain.entities.AuthorEntity;

public interface AuthorService {
    AuthorEntity createAuthor(AuthorEntity authorEntity);
}
