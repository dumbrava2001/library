package com.rain.library.service;

import com.rain.library.model.request.BookRequestDTO;
import com.rain.library.model.response.BookResponseDTO;

import java.util.List;

public interface BookService {

    List<BookResponseDTO> getAllBooks();

    void addBook(BookRequestDTO book);

    void deleteBook(int id);
}
