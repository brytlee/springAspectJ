package edu.miu.cs544.paweni.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class Logger1 {

    @Pointcut("execution(* edu.miu.cs544.paweni.service.EmailService.*(..))")
    public void allMethodsInEmailService(){}

    @Before("allMethodsInEmailService()")
    public void before(JoinPoint joinPoint){
        System.out.println("Before 1: " + joinPoint.getSignature().getDeclaringTypeName() +
                ": " + joinPoint.getSignature().getName());
    }

    @After("allMethodsInEmailService()")
    public void after(JoinPoint joinPoint){
        System.out.println("After 1: " + joinPoint.getSignature().getDeclaringTypeName() +
                ": " + joinPoint.getSignature().getName());
    }

    @AfterReturning("allMethodsInEmailService()")
    public void afterReturning(JoinPoint joinPoint){
        System.out.println("After Returning 1: " + joinPoint.getSignature().getDeclaringTypeName() +
                ": " + joinPoint.getSignature().getName());
    }

    @AfterThrowing("allMethodsInEmailService()")
    public void afterThrowing(JoinPoint joinPoint){
        System.out.println("After Throwing 1: " + joinPoint.getSignature().getDeclaringTypeName() +
                ": " + joinPoint.getSignature().getName());
    }

    @Around("allMethodsInEmailService()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around Before Execution 1: " + proceedingJoinPoint.getSignature().getDeclaringTypeName() +
                ": " + proceedingJoinPoint.getSignature().getName());

        if(true){
            proceedingJoinPoint.proceed();
        }
        System.out.println("Around After Execution 1: " + proceedingJoinPoint.getSignature().getDeclaringTypeName() +
                ": " + proceedingJoinPoint.getSignature().getName());
    }
}
