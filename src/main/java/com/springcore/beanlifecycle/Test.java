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
        SetUpBox setupbox= (SetUpBox) context.getBean("SetUpBox");
        System.out.println(setupbox.getName());
        Remote r1= (Remote) context.getBean("remote");
        System.out.println(r1);
    }
}
