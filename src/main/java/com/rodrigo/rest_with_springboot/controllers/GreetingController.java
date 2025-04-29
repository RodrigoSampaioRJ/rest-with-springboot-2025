package com.rodrigo.rest_with_springboot.controllers;

import com.rodrigo.rest_with_springboot.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private String template = "Hello, %s";
    private AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(defaultValue = "World!") String name){
        return new Greeting(String.format(template, name), counter.getAndIncrement());
    }
}
