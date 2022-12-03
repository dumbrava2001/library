package com.rain.library.service.impl;

import com.rain.library.repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AuthorServiceTest {

    @Mock
    private AuthorRepository authorRepository;

    @InjectMocks
    private AuthorServiceImpl authorService;

    @Test
    void getAllAuthors() {
    }

    @Test
    void addAuthor() {
    }

    @Test
    void deleteAuthorById() {
    }
}