package br.net.benfatto.jacares.advice;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

/**
 * @author Murilo Oliveira
 */
@ControllerAdvice
public class GlobalControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({EntityNotFoundException.class})
    public ResponseEntity<Object> handleEntityNotFoundException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({DataIntegrityViolationException.class})
    public ResponseEntity<Object> handleDataIntegrityViolationException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
