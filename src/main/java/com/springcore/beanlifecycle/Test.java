package com.springcore.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("beanlifecycle.xml");
        TV tv=(TV) context.getBean("TV");
        System.out.println(tv);
        //regestering shutdown hook
        context.registerShutdownHook();
    }
}
