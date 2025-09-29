package com.kapil.examples.java.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple REST controller that responds with a greeting message.
 * Demonstrates the use of Spring Boot annotations to create a RESTful web service.
 *
 * @author Kapil Garg
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Kapil Garg! 🚀";
    }

}
