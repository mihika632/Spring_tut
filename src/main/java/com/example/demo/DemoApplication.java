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

        var comment = new Comment();
        comment.setAuthor("Alice");
        comment.setText("This is a great post!");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
