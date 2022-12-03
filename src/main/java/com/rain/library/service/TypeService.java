package com.rain.library.service;

import com.rain.library.model.request.TypeRequestDTO;
import com.rain.library.model.response.TypeResponseDTO;

import java.util.List;

public interface TypeService {

    List<TypeResponseDTO> getAllTypes();

    void addType(TypeRequestDTO typeRequest);
}
