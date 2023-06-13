package ru.itgirl.libraryproject.service;

import ru.itgirl.libraryproject.dto.AuthorCreateDto;
import ru.itgirl.libraryproject.dto.AuthorDto;
import ru.itgirl.libraryproject.dto.AuthorUpdateDto;

public interface AuthorService {
    AuthorDto getAuthorById(Long id);

    AuthorDto getAuthorBySurnameV1(String surname);

    AuthorDto getAuthorBySurnameV2(String surname);

    AuthorDto getAuthorBySurnameV3(String surname);

    AuthorDto createAuthor(AuthorCreateDto authorCreateDto);

    AuthorDto updateAuthor(AuthorUpdateDto authorUpdateDto);

    public void deleteAuthor(Long id);
}