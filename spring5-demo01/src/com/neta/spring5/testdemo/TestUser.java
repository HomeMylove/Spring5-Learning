package com.neta.spring5.testdemo;

import com.neta.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    private final ApplicationContext context =
            new ClassPathXmlApplicationContext("bean2.xml");

    @Test
    public void add(){
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }


}
