package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* com.example.demo.*Service.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
       String methodName = joinPoint.getSignature().getName();
       Object[] args = joinPoint.getArgs();
       logger.info("Entering method: " + methodName + " with arguments: " + java.util.Arrays.toString(args));
       Object returnedByMethod = joinPoint.proceed();
       logger.info("Exiting method: " + methodName + " with result: " + returnedByMethod); 
         return returnedByMethod;

    }
}
