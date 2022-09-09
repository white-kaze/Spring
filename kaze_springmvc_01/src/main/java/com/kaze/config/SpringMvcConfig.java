package com.kaze.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//  创建SpringMvc的配置文件，加载controller对应的Bean
@Configuration
@ComponentScan("com.kaze.controller")
//  开启json转为对象
@EnableWebMvc
public class SpringMvcConfig {
}
