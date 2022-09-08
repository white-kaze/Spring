package com.kaze.dao.impl;

import com.kaze.dao.UserDao;
import com.kaze.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {


    private List<String> stringList;
    private Map<String, User>userMap;
    private Properties properties;

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private String user;
    private int age;

    public void setUser(String user) {
        this.user = user;
    }

    public void setAge(int age) {
        this.age = age;
    }
// 1.无参构造方法Bean实例化
//    public UserDaoImpl() {
//        System.out.println("UserDaoIml创建");
//    }
//
//    public void init() {
//        System.out.println("初始化方法...");
//    }
//
//    // 手动关闭容器才会触发销毁方法
//    public void destory() {
//        System.out.println("销毁方法...");
//    }


    public void save() {
//        System.out.println(user+"+"+age);
        System.out.println(stringList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save is running...");
    }

}
