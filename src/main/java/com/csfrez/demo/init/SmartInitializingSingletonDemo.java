package com.csfrez.demo.init;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

@Component
public class SmartInitializingSingletonDemo implements SmartInitializingSingleton {

    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("SmartInitializingSingletonDemo.afterSingletonsInstantiated");
    }
}
