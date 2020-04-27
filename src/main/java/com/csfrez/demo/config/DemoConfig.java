package com.csfrez.demo.config;

import com.csfrez.demo.aspect.LogAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class DemoConfig {

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
