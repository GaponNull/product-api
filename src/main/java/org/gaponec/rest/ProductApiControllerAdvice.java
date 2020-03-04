package org.gaponec.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.NoSuchElementException;

@ControllerAdvice
class ProductApiControllerAdvice {

  @ResponseBody
  @ExceptionHandler(NoSuchElementException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String elementNotFountException(NoSuchElementException e) {
    return e.getMessage();
  }

  @ResponseBody
  @ExceptionHandler(IllegalArgumentException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  String illegalArgumentException(IllegalArgumentException e) {
    return e.getMessage();
  }
}
