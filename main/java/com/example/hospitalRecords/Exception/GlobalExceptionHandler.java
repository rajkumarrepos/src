package com.example.hospitalRecords.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.hibernate.query.sqm.tree.SqmNode.log;

@ControllerAdvice
    @ResponseStatus
    public class GlobalExceptionHandler {
        @ExceptionHandler(value = CustomException.class)
        public ResponseEntity<ErrorResponse> exception(CustomException exception) {
           log.info(exception.getErrCode()+", "+exception.getErrMessage());
           ErrorResponse errorResponse = new ErrorResponse(exception.getErrCode(), exception.getErrMessage());

            return new ResponseEntity<>(errorResponse, HttpStatus.OK);

        }
      @ExceptionHandler(value = Exception.class)
        public ResponseEntity<?> commonException(Exception exception){
            String message = exception.toString();

            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);

        }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationException(MethodArgumentNotValidException ex) {
        StringBuilder errorMessage = new StringBuilder();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            errorMessage.append(error.getDefaultMessage()).append("\n");
        });

        return ResponseEntity.badRequest().body(errorMessage.toString());
    }
    }

