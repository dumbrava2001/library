package com.rain.library.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidTypeProvidedException extends RuntimeException {

    public InvalidTypeProvidedException(String message) {
        super(message);
    }
}
