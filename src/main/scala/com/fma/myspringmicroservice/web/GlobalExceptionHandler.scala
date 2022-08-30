package com.fma.myspringmicroservice.web

import org.springframework.http.HttpStatus
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.{ExceptionHandler, ResponseStatus, RestControllerAdvice}

@RestControllerAdvice
class GlobalExceptionHandler {
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  @ExceptionHandler(Array(classOf[MethodArgumentNotValidException]))
  def methodArgumentNotValidExceptionHandler(exception: MethodArgumentNotValidException): Unit = {
    println(s"Sorry that wasn't quite right: ${exception.getMessage}")
  }
}
