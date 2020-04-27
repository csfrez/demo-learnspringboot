package com.csfrez.demo.service;

import com.csfrez.demo.annotation.LogBack;
import org.springframework.stereotype.Component;

public interface DemoService {

    @LogBack
    public String hello(String name);
}
