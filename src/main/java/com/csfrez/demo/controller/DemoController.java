package com.csfrez.demo.controller;

import com.csfrez.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @Value("${my.uuid}")
    private String uuid;

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

    @GetMapping("/test")
    public String test() {
        double random = Math.round(Math.random()*1000);
        long time = Double.valueOf(random).longValue();
        System.out.println(Thread.currentThread().getName()+"==>"+random);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "test";
    }

    @GetMapping("/uuid")
    public String uuid(){
        return this.uuid;
    }
}
