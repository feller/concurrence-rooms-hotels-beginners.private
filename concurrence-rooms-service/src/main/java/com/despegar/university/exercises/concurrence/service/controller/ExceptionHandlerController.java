package com.despegar.university.exercises.concurrence.service.controller;

import com.despegar.library.api.exception.ExceptionControllerAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandlerController extends ExceptionControllerAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandlerController.class);

}
