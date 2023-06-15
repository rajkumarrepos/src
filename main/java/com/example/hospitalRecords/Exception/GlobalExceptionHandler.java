package com.example.hospitalRecords.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

    @ControllerAdvice
    @ResponseStatus
    public class GlobalExceptionHandler {
        @ExceptionHandler(value = CustomException.class)
        public ResponseEntity<?> exception(CustomException exception) {
            String message = "Error Code" + " " + exception.getErrCode()+"---------> Error Message: " + exception.getErrMessage();

            return new ResponseEntity<>(message, HttpStatus.OK);

        }
       @ExceptionHandler(value = Exception.class)
        public ResponseEntity<?> commonException(Exception exception){
            String message = exception.toString();

            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);

        }
    }

