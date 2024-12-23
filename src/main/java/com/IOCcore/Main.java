package com.IOCcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("config.xml");
        Student s1=(Student) context.getBean("s1obj");
        Student s2=(Student) context.getBean("s2obj");
        Student s3 = (Student) context.getBean("s3obj");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }


}