package com.rain.library.service.impl;

import com.rain.library.model.request.BookRequestDTO;
import com.rain.library.model.entity.Author;
import com.rain.library.model.entity.Book;
import com.rain.library.model.entity.Type;
import com.rain.library.model.response.BookResponseDTO;
import com.rain.library.repository.AuthorRepository;
import com.rain.library.repository.BookRepository;
import com.rain.library.repository.TypeRepository;
import com.rain.library.service.BookService;
import com.rain.library.service.exception.InvalidAuthorProvidedException;
import com.rain.library.service.exception.InvalidTypeProvidedException;
import com.rain.library.service.exception.InvalidYearProvidedException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    private AuthorRepository authorRepository;

    private TypeRepository typeRepository;

    @Override
    public List<BookResponseDTO> getAllBooks() {
        List<Book> allBooks = bookRepository.findAll();
        return allBooks.stream()
                .map(this::createResponseDTO)
                .toList();
    }

    @Override
    public void addBook(BookRequestDTO book) {
        Optional<Author> author = authorRepository
                .findAuthorByNameAndLastNameIgnoreCase(book.getAuthorName(),
                        book.getAuthorLast());

        if (author.isEmpty()) {
            log.warn("Author" + book.getAuthorName() + book.getAuthorLast());
            throw new InvalidAuthorProvidedException("Invalid author name provided");
        }

        Optional<Type> type = typeRepository
                .findTypeByTypeIgnoreCase(book.getType());
        if (type.isEmpty()) {
            throw new InvalidTypeProvidedException("Invalid type provided");
        }

        if (book.getYear() > Year.now().getValue()) {
            throw new InvalidYearProvidedException("Invalid year provided");
        }

        Book newBook = Book.builder()
                .author(author.get())
                .year(Year.of(book.getYear()))
                .type(type.get())
                .title(book.getTitle())
                .build();

        bookRepository.save(newBook);
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

    private BookResponseDTO createResponseDTO(Book book) {
        String authorFullName = book.getAuthor().getName() + " "
                + book.getAuthor().getLastName();
        return BookResponseDTO.builder()
                .title(book.getTitle())
                .type(book.getType().getType())
                .author(authorFullName)
                .year(book.getYear().getValue())
                .build();
    }
}
