package com.neta.spring5.factorybean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class TestFactoryBean {

    private final ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

    @Test
    public void test1(){
        Course course = context.getBean("myBean", Course.class);

        System.out.println(course);

    }

}
