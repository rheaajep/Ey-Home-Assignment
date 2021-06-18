package com.example.AccessingUserData;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="No such user")
public class EntityNotFoundException extends RuntimeException{
    
}