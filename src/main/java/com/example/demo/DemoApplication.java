package com.example.demo;

import org.springframework.context.ApplicationContext;
import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);    

        Person person=context.getBean(Person.class);
        // Parrot parrot=context.getBean(Parrot.class);
        // System.out.println("Person Name: " + person.getName());
        // System.out.println("Parrot Name: " + parrot);
        System.out.println("Person's Parrot Name: " + person.getParrot().getName());

    }
}
