package com.minhhoangtran.springrestapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.minhhoangtran.springrestapi.exception.NoContactException;
import com.minhhoangtran.springrestapi.pojo.ErrorResponse;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(NoContactException.class)
    public ResponseEntity<Object> handleContactNotFoundException(NoContactException ex) {
        ErrorResponse errorResponse = new ErrorResponse(ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
