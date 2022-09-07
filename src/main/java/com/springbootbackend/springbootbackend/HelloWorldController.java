package com.springbootbackend.springbootbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World! starting at http://localhost:8080";
    }
}
