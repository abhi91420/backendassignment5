package com.example.assignment5.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InfoException.class)
    public ResponseEntity<String> userNotFound(InfoException ie){
        return new ResponseEntity<>(ie.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
