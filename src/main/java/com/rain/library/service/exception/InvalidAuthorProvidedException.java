package com.rain.library.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidAuthorProvidedException extends RuntimeException{
    public InvalidAuthorProvidedException(String message){
        super(message);
    }
}
