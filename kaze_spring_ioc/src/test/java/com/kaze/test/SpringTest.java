package com.kaze.test;

import com.kaze.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    // 测试scope属性
    // 单例，地址一样，说明容器内部只有一个bean对象
    // 多例，地址不一样，说明容器有多个bean对象
    public void test() {
        // 单例模式：加载xml文件时，对象就被创建了
        // 多例模式：getBean时创建对象
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) app.getBean("userDao");
        System.out.println(userDao1);
    }
}
