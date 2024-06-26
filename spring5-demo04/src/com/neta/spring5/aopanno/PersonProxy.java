package com.neta.spring5.aopanno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {

    @After(value = "execution(* com.neta.spring5.aopanno.User.add(..))")
    public void after(){
        System.out.println("person after ...");
    }


    @Before("execution(* com.neta.spring5.aopanno.User.add(..))")
    public void before(){
        System.out.println("person before ...");
    }


}
