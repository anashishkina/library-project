package ru.itgirl.libraryproject.service;

import ru.itgirl.libraryproject.dto.AuthorDto;

public interface AuthorService {
    AuthorDto getAuthorById(Long id);

    AuthorDto getAuthorBySurnameV1(String surname);

    AuthorDto getAuthorBySurnameV2(String surname);

    AuthorDto getAuthorBySurnameV3(String surname);
}