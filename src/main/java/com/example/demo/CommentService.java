package com.example.demo;


import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;



@Service
public class CommentService {
   private Logger logger = Logger.getLogger(CommentService.class.getName());

   public void publishComment(Comment comment) {
       // Logic to publish the comment
       logger.info("Publishing comment by " + comment.getText());
   }

    

}
