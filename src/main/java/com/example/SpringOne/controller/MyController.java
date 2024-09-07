package com.example.SpringOne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  // Optional: Use this to define a common prefix for your endpoints
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
