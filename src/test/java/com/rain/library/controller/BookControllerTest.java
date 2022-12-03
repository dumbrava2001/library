package com.rain.library.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rain.library.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
class BookControllerTest {

    @Autowired
    private ObjectMapper objectMapper;

    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @InjectMocks
    private BookController bookController;


    @Test
    void getAllBooks() {
    }

    @Test
    void addBook() {
    }

    @Test
    void testGetAllBooks() {
    }

    @Test
    void testAddBook() {
    }

    @Test
    void removeBook() {
    }
}