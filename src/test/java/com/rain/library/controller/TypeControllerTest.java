package com.rain.library.controller;

import com.rain.library.service.TypeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
class TypeControllerTest {

    private MockMvc mockMvc;

    @MockBean
    private TypeService typeService;

    @InjectMocks
    private TypeController typeController;

    @Test
    void getAllTypes() {
    }

    @Test
    void addType() {
    }
}