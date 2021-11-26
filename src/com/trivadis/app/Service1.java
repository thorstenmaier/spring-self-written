package com.trivadis.app;

import com.trivadis.spring.Autowired;
import com.trivadis.spring.Component;
import com.trivadis.spring.PostConstruct;

@Component
public class Service1 {
    @Autowired
    private Service2 service2;

    public Service1() {
        System.out.println("Service1 created");
    }

    @PostConstruct
    public void init() {
        System.out.println("init: " + service2);
    }
}
