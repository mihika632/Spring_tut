package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "john";

    public Parrot() {
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot{name='" + name + "'}";
    }
     
}
