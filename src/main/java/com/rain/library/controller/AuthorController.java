package com.rain.library.controller;

import com.rain.library.model.request.AuthorRequestDTO;
import com.rain.library.model.entity.Author;
import com.rain.library.model.response.AuthorResponseDTO;
import com.rain.library.service.AuthorService;
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
@RequestMapping("/authors")
public class AuthorController {

    private AuthorService authorService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AuthorResponseDTO> getAllAuthors(){
        return authorService.getAllAuthors();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewAuthor(@RequestBody AuthorRequestDTO author){
        authorService.addAuthor(author);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteAuthor(@RequestParam int id) {
        authorService.deleteAuthorById(id);
    }
}
