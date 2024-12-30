package com.springcore.autowire;

public class Student {
    private String sName;
    private Collage collage;

    public void setCollage(Collage collage) {
        System.out.println("setting value using setter method:"+collage);
        this.collage = collage;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        System.out.println("setting value using setter method:"+sName);
        this.sName = sName;
    }

    public Collage getCollage() {
        return collage;
    }

    public Student(String sName, Collage collage) {
        System.out.println("setting value using constructor:"+sName+","+collage);
        this.sName = sName;
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
