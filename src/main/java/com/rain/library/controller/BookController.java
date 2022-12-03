package com.rain.library.controller;


import com.rain.library.model.request.BookRequestDTO;
import com.rain.library.model.response.BookResponseDTO;
import com.rain.library.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @GetMapping
    public List<BookResponseDTO> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody BookRequestDTO book){
        bookService.addBook(book);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void removeBook(@RequestParam int id){
        bookService.deleteBook(id);
    }
}
