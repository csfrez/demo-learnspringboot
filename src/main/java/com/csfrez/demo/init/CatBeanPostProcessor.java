package com.csfrez.demo.init;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CatBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof CatInitializingBean) {
            System.out.println("CatBeanPostProcessor postProcessBeforeInitialization run...");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof CatInitializingBean) {
            System.out.println("CatBeanPostProcessor postProcessAfterInitialization run...");
        }
        return bean;
    }

}
