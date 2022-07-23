package com.neta.spring5.testdemo;

import com.neta.spring5.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    private final   ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

    @Test
    public void testAdd(){
        // 加载 配置文件
        User user = context.getBean("user", User.class);
        user.add();
        System.out.println("user="+user);
    }


    @Test
    public void testOrder(){
        Object order = context.getBean("order");
        System.out.println("order="+order);
    }
}
