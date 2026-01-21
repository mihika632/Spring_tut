package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        // Persist comment via simple stdout for now
        System.out.println("Storing comment in the database: " + comment.getText());
    }
}
