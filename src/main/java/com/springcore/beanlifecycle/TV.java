package com.springcore.beanlifecycle;

public class TV {
    private String size;

    public TV(String size) {
        this.size = size;
    }

    public TV() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void init(){
        System.out.println("inside init method");
    }
    public void destroy(){
        System.out.println("inside destroy method");
    }
    @Override
    public String toString() {
        return "TV{" +
                "size='" + size + '\'' +
                '}';
    }
}
