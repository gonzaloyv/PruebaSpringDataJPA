package com.example.PruebaSpringDataJPA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String hola() {
        return "Hola Gonzalo, Spring Boot funciona.";
    }
}
