package com.csfrez.demo.init;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanDemo implements FactoryBean<FactoryBeanDemo.FactoryInnerBean> {

    @Override
    public FactoryInnerBean getObject() throws Exception {
        System.out.println("FactoryBeanDemo.getObject");
        return new FactoryBeanDemo.FactoryInnerBean();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBeanDemo.FactoryInnerBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public static class FactoryInnerBean {

    }
}
