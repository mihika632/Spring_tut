package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements   CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        // Send email notification about the comment
        System.out.println("Sending email notification for comment: " + comment.getText());
    }
    
}
