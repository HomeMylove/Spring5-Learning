package com.neta.spring5.factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.awt.*;

public class MyBean implements FactoryBean<Course>{

    // 定义返回的 bean
    @Override
    public Course getObject() {
        Course course = new Course();
        course.setCname("java从入门到精通");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
