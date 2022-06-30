package com.example.springbootaop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.ALREADY_REPORTED , reason = "Kullanıcı bulunamadı")
public class UserNotNullException extends RuntimeException{

}
