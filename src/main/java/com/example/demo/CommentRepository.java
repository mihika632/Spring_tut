package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.config.BeanDefinition;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CommentRepository {
    
}
