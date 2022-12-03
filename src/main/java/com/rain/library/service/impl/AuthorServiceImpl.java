package com.rain.library.service.impl;

import com.rain.library.model.entity.Author;
import com.rain.library.model.request.AuthorRequestDTO;
import com.rain.library.model.response.AuthorResponseDTO;
import com.rain.library.repository.AuthorRepository;
import com.rain.library.service.AuthorService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    @Override
    public List<AuthorResponseDTO> getAllAuthors() {
        List<Author> authors = authorRepository.findAll();
        return authors.stream()
                .map(this::createAuthorResponse)
                .collect(Collectors.toList());
    }

    @Override
    public void addAuthor(AuthorRequestDTO author) {
        Author newAuthor = createAuthorFromDTO(author);
        authorRepository.save(newAuthor);
    }

    @Override
    @Transactional
    public void deleteAuthorById(int id) {
        authorRepository.deleteById(id);
    }

    public AuthorResponseDTO createAuthorResponse(Author author) {
        return AuthorResponseDTO.builder()
                .authorName(author.getName() + " " + author.getLastName())
                .build();
    }

    public Author createAuthorFromDTO(AuthorRequestDTO authorDTO) {
        return Author.builder()
                .name(authorDTO.getAuthorName())
                .lastName(authorDTO.getAuthorLastName())
                .build();
    }
}
