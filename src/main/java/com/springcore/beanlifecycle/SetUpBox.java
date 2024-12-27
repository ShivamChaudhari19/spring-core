package com.springcore.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SetUpBox implements InitializingBean, DisposableBean {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//if you create a bean at that time the init and destroy method is called
//in short init and destroy method is automatically called when you declared
//a bean in the configuration file, it does not call when you get a bean by context.getBean()
    @Override
    public void destroy() throws Exception {
        //destroy method
        System.out.println("shutting down setup box");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //init method
        System.out.println("setup box is on");

    }
}
