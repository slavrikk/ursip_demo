package ru.ursip.test.crud.demo.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.NoSuchElementException;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler({NoSuchElementException.class})
    public ResponseEntity<Object> handleNotFoundElement(
            Exception ex, WebRequest request) {
        return new ResponseEntity<>(
                ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
