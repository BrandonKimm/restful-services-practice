package com.example.myrestfulservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hi";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("hello world bean ");
    }

    @GetMapping(path = "/hello-world-bean/{id}")
    public HelloWorldBean helloWorldBean(@PathVariable String id) {
        return new HelloWorldBean("hello world bean "+ id+ " !!!");
    }
}
