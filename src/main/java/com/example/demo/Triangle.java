package com.example.demo;

public class Triangle implements Shape {


    private String color;

    public Triangle(String color) {
        this.color = color;
    }

    // public void setColor(String color) {
    //     this.color = color;
    // }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " triangle");
    }
}
