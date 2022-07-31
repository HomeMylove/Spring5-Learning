package com.neta.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 增强的类
@Component
@Aspect  // 生成代理对象
@Order(2) // 切片顺序，数字越小，优先级越高
public class UserProxy {

    // 抽取切入点
    @Pointcut(value = "execution(* com.neta.spring5.aopanno.User.add(..))")
    public void pointDemo(){}

    // 前置通知
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before...");
    }

    // 在方法完全执行完毕之后执行
    @After(value = "pointDemo()")
    public void after(){
        System.out.println("after...");
    }


    @AfterThrowing(value = "execution(* com.neta.spring5.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("after throwing...");
    }

    //在返回结果后执行 所以在 After 之前
    @AfterReturning(value = "execution(* com.neta.spring5.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("after returning...");
    }

    @Around(value = "execution(* com.neta.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前...");

        // 被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后...");
    }




}
