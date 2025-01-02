package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("standalone.collectionConfig.xml");
        Person p1=context.getBean("person",Person.class);
        System.out.println(p1+"\n"+p1.getFriends().getClass().getName());
        Book book=context.getBean("book", Book.class);
        System.out.println(book+"\n"+book.getNamePrice().getClass().getName());
    }
}
