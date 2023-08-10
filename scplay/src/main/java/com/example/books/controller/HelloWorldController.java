package com.example.books.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@EnableAutoConfiguration
public class HelloWorldController {

    @Value("asd")
    private String defaultName;

    @GetMapping(path = "/", produces = "application/json")
    @ResponseBody
    public String getMessage() {
        return defaultName;
    }
}
