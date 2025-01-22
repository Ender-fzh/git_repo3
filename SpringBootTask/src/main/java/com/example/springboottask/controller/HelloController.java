package com.example.springboottask.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HelloController {

    // GET /hello
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, World!";
    }

    // GET /2025
    @GetMapping("/2025")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public String year2025() {
        return "2025 has not come yet!";
    }
}