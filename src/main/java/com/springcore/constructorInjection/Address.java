package com.springcore.constructorInjection;

public class Address {
    private String city;
    private int pinCode;

    public Address(String city, int pinCode) {
        this.city = city;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
