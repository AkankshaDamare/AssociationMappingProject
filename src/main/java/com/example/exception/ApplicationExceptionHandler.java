package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity <ApiResponse> studentNotFoundException (StudentNotFoundException e){

        ApiResponse api = new ApiResponse();
        api.setTime(LocalDateTime.now());
        api.setErrorMsg(e.getMessage());
        return new ResponseEntity<>(api, HttpStatus.NOT_FOUND);
    }



}
