package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    public  Parrot parrot;

    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
    
    public Parrot getParrot() {
        return parrot;
    }
}
