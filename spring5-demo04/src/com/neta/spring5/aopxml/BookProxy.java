package com.neta.spring5.aopxml;

import org.aspectj.lang.ProceedingJoinPoint;

import java.io.IOException;

public class BookProxy {

    public void before(){
        System.out.println("before ... >O<");
    }

}
