package com.springcore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class demo {
    @Value("#{8>5?36:9}")
    private int a;
    @Value("#{demo.getA()}") //@Value("#{demo.getA()}"): Calls the getA() method on the demo bean managed by Spring.
                            //The bean name demo corresponds to the class name with the first letter lowercased (default behavior of Spring for @Component).
    private  int b;
    @Value("#{T(java.lang.Math).PI}") //To call static methods or access static fields, use T(classname).
    private float pi;
    @Value("#{new java.lang.String('shivam')}")
//Implications:
//    While it may work in your case, relying on new in SpEL is not recommended for the following reasons:
//
//    Portability: This behavior is not guaranteed across all Spring environments or configurations.
//    Security: Allowing new can expose your application to potential risks if the SpEL expressions are externally controlled.
//    Readability: Standard alternatives like static factory methods or direct values are more intuitive for most Spring developers.
    private String name;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(int pi) {
        this.pi = pi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "demo{" +
                "a=" + a +
                ", b=" + b +
                ", pi=" + pi +
                ", name='" + name + '\'' +
                '}';
    }
}
