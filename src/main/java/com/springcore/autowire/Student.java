package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

    private String sName;
//    @Autowired
    private Collage collage;

    @Autowired
    @Qualifier("collage")
    public void setCollage(Collage collage) {
        System.out.println("setting value using setter method:" + collage);
        this.collage = collage;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        System.out.println("setting value using setter method:" + sName);
        this.sName = sName;
    }

    public Collage getCollage() {
        return collage;
    }

    public Student(Collage collage) {
        super();
        System.out.println("setting value using constructor:" + collage);
        this.collage = collage;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", collage=" + collage +
                '}';
    }
}
