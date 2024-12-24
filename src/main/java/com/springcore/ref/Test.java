package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String [] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("refConfig.xml");
        A aobj= (A) context.getBean("aref");
        System.out.println(aobj);
    }
}
