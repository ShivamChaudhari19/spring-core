package com.springcore.standalone.collection;

import java.util.Map;

public class Book {
    private Map<String,Double> namePrice;

    public Map<String, Double> getNamePrice() {
        return namePrice;
    }

    public void setNamePrice(Map<String, Double> namePrice) {
        this.namePrice = namePrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "namePrice=" + namePrice +
                '}';
    }
}
