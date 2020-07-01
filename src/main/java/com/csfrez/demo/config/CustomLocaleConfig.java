package com.csfrez.demo.config;

import com.csfrez.demo.locale.CustomLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@Configuration
public class CustomLocaleConfig extends WebMvcConfigurationSupport {

    @Bean
    public LocaleResolver localeResolver(){
        return new CustomLocaleResolver();
    }
}
