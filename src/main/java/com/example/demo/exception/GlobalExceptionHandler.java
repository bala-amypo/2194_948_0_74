package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.MethodArgumentNotValidException;
import java.util.*;
import org.springframework.http.ResponseEntity;

@RestControllerAdvice
public class globalExceptionHandler{

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleFieldError(MethodArgumentNotValidException ex){
        Map<String,String> error = new HashMap<>();

        ex.getBindingResult().getFieldsError().forEach( err -> error.put(ex.getFields(),ex.getDefualtMessage()));

        return new ResponseEntity<>(error.HttpStatus.BAD_REQUEST);
    }

}