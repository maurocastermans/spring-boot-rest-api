package com.mauro.RestAPIApplication.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor // (!) Jackson uses this and then sets values with getters and setters
@Builder
public class AuthorDto {

    private Long id;

    private String name;

    private Integer age;
}
