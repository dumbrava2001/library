package com.rain.library.controller;

import com.rain.library.model.request.TypeRequestDTO;
import com.rain.library.model.response.TypeResponseDTO;
import com.rain.library.service.TypeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/types")
public class TypeController {
    private TypeService typeService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TypeResponseDTO> getAllTypes(){
        return typeService.getAllTypes();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addType(@RequestBody TypeRequestDTO typeRequest){
        typeService.addType(typeRequest);
    }
}
