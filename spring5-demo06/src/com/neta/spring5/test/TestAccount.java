package com.neta.spring5.test;

import com.neta.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

public class TestAccount {

    @Test
    public void testAccount(){


        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();

    }

}
