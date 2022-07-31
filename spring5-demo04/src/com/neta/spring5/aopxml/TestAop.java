package com.neta.spring5.aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean2.xml");

        Book book = context.getBean("book", Book.class);

        book.buy();


    }
}
