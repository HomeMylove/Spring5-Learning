package com.neta.spring5.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHook {

    private final ApplicationContext context
            = new ClassPathXmlApplicationContext("bean4.xml");


    @Test
    public void test1(){
        Orders orders = context.getBean("orders", Orders.class);
        Orders orders1 = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取到了实例...");
        System.out.println(orders);

        ((ClassPathXmlApplicationContext) context).close();




    }

}
