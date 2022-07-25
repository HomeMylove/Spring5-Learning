package com.neta.spring5.auowire;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

    private final ApplicationContext context=
            new ClassPathXmlApplicationContext("bean5.xml");

    @Test
    public void test1(){
        Emp emp = context.getBean("emp", Emp.class);

        emp.test();
    }

}
