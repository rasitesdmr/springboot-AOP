package com.example.springbootaop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.ALREADY_REPORTED,reason = "Kullanıcı emaili zaten var ")
public class UserEmailAlreadyExistsException extends RuntimeException{
}
