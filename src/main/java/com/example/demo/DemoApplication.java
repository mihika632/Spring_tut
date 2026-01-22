package com.example.demo;

import org.springframework.context.ApplicationContext;
import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("John Doe");
        comment.setText("This is a sample comment.");
        service.publishComment(comment);
    }
}
