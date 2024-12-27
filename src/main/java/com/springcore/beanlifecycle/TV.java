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
        // init method calls at the time of bean
        System.out.println("TV turned ON");
    }
    public void destroy(){
        System.out.println("TV is OFF");
    }
    @Override
    public String toString() {
        return "TV{" +
                "size='" + size + '\'' +
                '}';
    }
}
