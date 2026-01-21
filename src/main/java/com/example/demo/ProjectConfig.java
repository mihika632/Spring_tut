package com.example.demo;

import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {
    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Polly");
        return p;
    }

    //  @Bean
    // Parrot parrot1(){
    //     var p = new Parrot();
    //     p.setName("RIKI");
    //     return p;
    // }

    //  @Bean
    // Parrot parrot2(){
    //     var p = new Parrot();
    //     p.setName("MIKKI");
    //     return p;
    // }

    @Bean
    String hello(){
        return "Hello World";
    }

    @Bean
    Integer number(){
        return 42;
    }

}
