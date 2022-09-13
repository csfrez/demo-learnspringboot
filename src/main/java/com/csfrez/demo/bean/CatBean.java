package com.csfrez.demo.bean;

import com.csfrez.demo.init.FactoryBeanDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatBean {

    @Autowired
    PersonBean personBean;

    @Autowired
    FactoryBeanDemo.FactoryInnerBean factoryInnerBean;

}
