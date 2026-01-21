package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class ProjectConfig {
    @Bean
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Polly");
        return p;
    }

    @Bean
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Tolly");
        return p;
    }

    @Bean
    public Person person(@Qualifier("parrot1") Parrot parrot) {
        Person p = new Person();
        p.setName("John");
        p.setParrot(parrot);
        return p;
    }

}
