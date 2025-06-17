package com.exampleSpringBoot.May2025.ems.exception;

import jdk.jshell.Snippet;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourseNotFoundException extends RuntimeException{
    public ResourseNotFoundException(String message)
    {
        super(message);
    }

}
