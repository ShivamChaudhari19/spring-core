package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("autowireConfig.xml");
        Student s1=(Student) context.getBean("student");
        System.out.println(s1);
    }
}
