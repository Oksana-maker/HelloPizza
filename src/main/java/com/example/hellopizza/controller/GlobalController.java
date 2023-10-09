package com.example.hellopizza.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalController {
    @ModelAttribute("url")
    public String getRequestURL(HttpServletRequest httpServletRequest){
        return httpServletRequest.getServletPath();
    }
}
