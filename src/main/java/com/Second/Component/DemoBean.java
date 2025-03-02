package com.Second.Component;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    public DemoBean() {
        System.out.println("DemoBean initialized");
    }

    @Override
    public String toString() {
        return "This is DemoBean!";
    }
}
