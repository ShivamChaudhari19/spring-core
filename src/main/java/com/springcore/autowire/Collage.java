package com.springcore.autowire;

public class Collage {
    private String cName;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        System.out.println("setting using setter:"+ cName);
        this.cName = cName;
    }

    public Collage(String cName) {
        System.out.println("setting using constructor:"+cName);
        this.cName = cName;
    }

    public Collage() {
    }

    @Override
    public String toString() {
        return "Collage{" +
                "cName='" + cName + '\'' +
                '}';
    }
}
