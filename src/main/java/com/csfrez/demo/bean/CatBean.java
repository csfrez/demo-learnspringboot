package com.csfrez.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatBean {

    @Autowired
    PersonBean personBean;

}
