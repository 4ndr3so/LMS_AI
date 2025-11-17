package com.orjuelasso.back.lms.testAOP;

import org.springframework.stereotype.Component;

@Component
public class Test {

    @TimeMonitor
    public void display(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Inside Display Method");
    }
}
