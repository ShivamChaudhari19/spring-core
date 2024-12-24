package com.springcore.ref;

public class A {
    private int a;
    private B ob;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    public A() {
    }

    public A(int a) {
        this.a = a;
    }
    int add(){
        return a+ob.getB();
    }
    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", ob=" + ob +
                '}';
    }
}
