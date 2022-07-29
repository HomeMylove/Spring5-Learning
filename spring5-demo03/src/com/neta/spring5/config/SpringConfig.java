package com.neta.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 创建配置类，替代配置文件
@Configuration
@ComponentScan(basePackages = "com.neta.spring5")
public class SpringConfig {

}
