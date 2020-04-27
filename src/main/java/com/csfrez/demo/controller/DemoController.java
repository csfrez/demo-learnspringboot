package com.csfrez.demo.controller;

import com.csfrez.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("/hello")
    public String hello(String name){
        name = name == null ? "Frez" : name;
        double random = Math.random();
        System.out.println("random=" + random);
        if(random > 0.5){
            throw new RuntimeException("Manual RuntimeException");
        }
        return demoService.hello(name);
    }
}
