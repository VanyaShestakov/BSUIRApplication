package com.ivanshestakov.bsuirapplication.ExceptionHandlers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice("Controller.ScheduleController")
public class ScheduleControllerExceptionHandler {

    @ExceptionHandler
    public String handleHttpClientErrorException(HttpClientErrorException exception) {
        return "my_schedule";
    }
}
