package ru.itgirl.libraryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import ru.itgirl.libraryproject.model.Author;
import ru.itgirl.libraryproject.model.Book;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long>, JpaSpecificationExecutor<Author> {
    Optional<Author> findAuthorBySurname(String surname);

    @Query(nativeQuery = true, value = "SELECT author.id, author.name, author.surname, book.name AS book_name\n" +
            "FROM author\n" +
            "JOIN author_book ON author.id = author_book.author_id\n" +
            "JOIN book ON author_book.book_id = book.id\n" +
            "WHERE author.surname = ?")
    Optional<Author> findAuthorBySurnameBySql(String surname);
}