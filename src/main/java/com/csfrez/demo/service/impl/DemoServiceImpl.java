package com.csfrez.demo.service.impl;

import com.csfrez.demo.service.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceImpl implements DemoService {

    @Override
    public String hello(String name) {
        return "Hello " + name + ", time is " + System.currentTimeMillis();
    }
}
