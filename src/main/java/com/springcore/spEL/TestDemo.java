package com.springcore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        demo demo=context.getBean("demo",demo.class);
        System.out.println(demo);
    }
}
