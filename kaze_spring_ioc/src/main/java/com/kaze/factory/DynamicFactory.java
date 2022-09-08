package com.kaze.factory;

import com.kaze.dao.UserDao;
import com.kaze.dao.impl.UserDaoImpl;

public class DynamicFactory {
    public  UserDao getUserdao(){
        return new UserDaoImpl();
    }
}
