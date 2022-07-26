package com.example.demo3.controller;

import com.example.demo3.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/name")
    public String helloName(){
        return "Hello "+helloService.getName();
    }
}
