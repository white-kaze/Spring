package com.kaze.dao.Impl;

import com.kaze.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//<bean id="userDao" class="com.kaze.dao.Impl.UserDaoImpl"/>
// 注解代替bean
//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Value("${jdbc.driver}")
    private String driver;
    public void save(){
        System.out.println(driver);
        System.out.println("dao is running...");
    }
}
