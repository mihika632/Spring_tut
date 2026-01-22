package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.BeanDefinition;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {
    private Comment comment;

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getComment() {
        return this.comment;
    }

    public void processComment() {
        // Process the comment (e.g., moderate, analyze sentiment, etc.)
        System.out.println("Processing comment: " + comment.getText());
    }

    public void validateComment() {
        // Validate the comment (e.g., check for prohibited content)
        if (comment.getText() == null || comment.getText().isEmpty()) {
            throw new IllegalArgumentException("Comment text cannot be empty");
        }
        System.out.println("Comment is valid.");
    }

}
