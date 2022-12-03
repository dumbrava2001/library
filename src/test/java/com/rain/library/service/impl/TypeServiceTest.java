package com.rain.library.service.impl;

import com.rain.library.repository.TypeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TypeServiceTest {

    @Mock
    private TypeRepository typeRepository;

    @InjectMocks
    private TypeServiceImpl typeService;

    @Test
    void getAllTypes() {
    }

    @Test
    void addType() {
    }
}