package com.springcore.ref;

public class B {
    private  int b;

    public B(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public B() {
    }

    @Override
    public String toString() {
        return "B{" +
                "b=" + b +
                '}';
    }
}
