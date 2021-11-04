package com.joelio.myapi.Controllers.Exception;

import com.joelio.myapi.Services.Exception.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandle {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandaedError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){

        StandaedError error = new StandaedError(HttpStatus.NOT_FOUND.value(),System.currentTimeMillis(),e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
