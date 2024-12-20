package com.example.SpringTwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return """
                <html>
                <head>
                    <style>
                        body {
                            font-size: 24px;
                            color: #333;
                            font-family: Arial, sans-serif;
                            text-align: center;
                            margin-top: 50px;
                        }
                    </style>
                </head>
                <body>
                    Hello, World Rashmi is Coding Here!
                </body>
                </html>
                """;
    }
}
