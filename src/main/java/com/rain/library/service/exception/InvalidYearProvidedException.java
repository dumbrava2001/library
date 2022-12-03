package com.rain.library.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidYearProvidedException extends RuntimeException {

    public InvalidYearProvidedException(String message) {
        super(message);
    }
}
