package com.neta.spring5.aopanno;

import org.springframework.stereotype.Component;

// 被增强的类
@Component
public class User {

    public void add(){
        System.out.println("add...");

//        System.out.println(1/0);
    }

}
