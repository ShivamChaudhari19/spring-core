package com.springcore.constructorInjection;

public class Person {
    private String name;
    private int personId;
    private Address address;
    public Person(String name, int personId,Address address) {
        this.name = name;
        this.personId = personId;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                "Address=" + address+
                '}';
    }
}
