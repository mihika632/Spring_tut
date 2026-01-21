package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Polly");
        return p;
    }

    @Bean
    public Person person(Parrot parrot){
        Person p = new Person();
        p.setName("John");
        p.setParrot(parrot);
       return p;
    }

}
