package com.csfrez.demo.listen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


public class DemoSpringApplicationRunListener implements SpringApplicationRunListener {

    private final SpringApplication application;
    private final String[] args;

    public DemoSpringApplicationRunListener(SpringApplication application, String[] args) {
        System.out.println("DemoSpringApplicationRunListener.constructor() ");
        this.application = application;
        this.args = args;
    }


    @Override
    public void starting() {
        System.out.println("DemoSpringApplicationRunListener.starting() ");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.out.println("DemoSpringApplicationRunListener.environmentPrepared() ");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("DemoSpringApplicationRunListener.contextPrepared() ");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("DemoSpringApplicationRunListener.contextLoaded() ");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("DemoSpringApplicationRunListener.started() ");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("DemoSpringApplicationRunListener.running() ");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("DemoSpringApplicationRunListener.failed() ");
    }
}
