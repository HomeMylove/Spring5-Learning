package com.neta.spring5.test;

import com.neta.spring5.config.TxConfig;
import com.neta.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TestAccount {

    @Test
    public void testAccount(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();

    }


    @Test
    public void testAccount2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();
    }


    @Test
    public void testAccount3(){
        ApplicationContext  context =
                new AnnotationConfigApplicationContext(TxConfig.class);

        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();
    }

    @Test
    public void testGenericApplicationContext(){
        // 1.创建 GenericApplicationContext 对象
        GenericApplicationContext context =
                new GenericApplicationContext();

        context.refresh(); // 清空

        // 2. 注册
        // public <T> void registerBean(@Nullable String beanName, Class<T> beanClass, @Nullable Supplier<T> supplier, BeanDefinitionCustomizer... customizers)
        context.registerBean("user",User.class,()->new User());

        // 3. 获取
        User bean = context.getBean("user", User.class);

        System.out.println(bean);
    }


}
