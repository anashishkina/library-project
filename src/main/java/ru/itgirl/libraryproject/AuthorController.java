package ru.itgirl.libraryproject;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.itgirl.libraryproject.dto.AuthorCreateDto;
import ru.itgirl.libraryproject.dto.AuthorDto;
import ru.itgirl.libraryproject.dto.AuthorUpdateDto;
import ru.itgirl.libraryproject.service.AuthorService;

@RestController
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/author/{id}")
    AuthorDto getAuthorById(@PathVariable("id") Long id) {
        return authorService.getAuthorById(id);
    }

    @GetMapping("/author")
    AuthorDto getAuthorByName(@RequestParam("surname") String surname) {
        return authorService.getAuthorBySurnameV1(surname);
    }

    @GetMapping("/author/v2")
    AuthorDto getAuthorByNameBySql(@RequestParam("surname") String surname) {
        return authorService.getAuthorBySurnameV2(surname);
    }

    @GetMapping("/author/v3")
    AuthorDto geAuthorByNameV3(@RequestParam("surname") String surname) {
        return authorService.getAuthorBySurnameV3(surname);
    }

    @PostMapping("/author/create")
    AuthorDto createAuthor(@RequestBody AuthorCreateDto authorCreateDto) {
        return authorService.createAuthor(authorCreateDto);
    }

    @PutMapping("/author/update")
    AuthorDto updateAuthor(@RequestBody AuthorUpdateDto authorUpdateDto) {
        return authorService.updateAuthor(authorUpdateDto);
    }

    @DeleteMapping("/author/delete/{id}")
    void updateAuthor(@PathVariable("id") Long id) {
        authorService.deleteAuthor(id);
    }

}