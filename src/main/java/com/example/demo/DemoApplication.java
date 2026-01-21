package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        // ApplicationContext context =
        //         new ClassPathXmlApplicationContext("shapes-beans.xml");

        // Shape triangle = context.getBean("triangle", Shape.class);
        // triangle.draw();

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p);
        System.out.println(p.getName());
        
        //  Parrot p1 = context.getBean("parrot1",Parrot.class);
        // System.out.println(p1.getName());

        // Parrot p2 = context.getBean("parrot2",Parrot.class);
        // System.out.println(p2.getName());

        // String s = context.getBean(String.class);
        // System.out.println(s);

        // Integer n = context.getBean(Integer.class);
        // System.out.println(n);

    }
}
