package com.example.demo;

import org.springframework.context.ApplicationContext;
import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

                // ❶ Create Spring context
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

         System.out.println("Before retrieving the CommentService");
        var commentService = c.getBean(CommentService.class);
         System.out.println("After retrieving the CommentService");
        // var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // var s1 = c.getBean(CommentService.class);
        // var s2 = c.getBean(UserService.class);

        // boolean b = s1.getCommentRepository()==s2.getCommentRepository();
        // System.out.println(b);

        // var cs1 = c.getBean("commentService", CommentService.class);
        // var cs2 = c.getBean("commentService", CommentService.class);
        // boolean areSame = cs1 == cs2;
        // System.out.println("Are both CommentService instances the same? " + areSame);

        // var context=new AnnotationConfigApplicationContext(ProjectConfig.class);    

        // var comment = new Comment();
        // comment.setAuthor("Alice");
        // comment.setText("This is a great post!");

        // var commentService = context.getBean(CommentService.class);
        // commentService.publishComment(comment);
    }
}
