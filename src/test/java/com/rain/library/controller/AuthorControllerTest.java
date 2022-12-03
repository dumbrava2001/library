package com.rain.library.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rain.library.model.request.AuthorRequestDTO;
import com.rain.library.service.AuthorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
class AuthorControllerTest {

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private ObjectMapper objectMapper;

    private MockMvc mockMvc;

    @MockBean
    private AuthorService authorService;

    @InjectMocks
    private AuthorController authorController;

    private final String AUTHOR_PATH = "/authors";

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context)
                .build();
    }

    @Test
    void getAllAuthors() throws Exception {
        when(authorService.getAllAuthors()).thenReturn(Collections.emptyList());

        mockMvc.perform(get(AUTHOR_PATH))
                .andExpect(status().is(200));
    }

    @Test
    void addNewAuthor() throws Exception {

        AuthorRequestDTO authorRequestDTO = createRequestDTO();

        String request = objectMapper.writeValueAsString(authorRequestDTO);

        mockMvc.perform(post(AUTHOR_PATH)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(request))
                .andExpect(status().is(201));
    }

    @Test
    void deleteAuthor() {

    }

    private AuthorRequestDTO createRequestDTO(){
        return AuthorRequestDTO.builder()
                .authorName("King")
                .authorLastName("Stephen")
                .build();
    }
}