package com.rain.library.service;


import com.rain.library.model.entity.Author;
import com.rain.library.model.request.AuthorRequestDTO;
import com.rain.library.model.response.AuthorResponseDTO;

import java.util.List;

public interface AuthorService {

    List<AuthorResponseDTO> getAllAuthors();

    void addAuthor(AuthorRequestDTO author);

    void deleteAuthorById(int id);
}
