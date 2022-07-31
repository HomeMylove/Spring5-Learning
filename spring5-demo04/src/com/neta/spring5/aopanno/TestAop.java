package com.neta.spring5.aopanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);

        user.add();
    }
}
