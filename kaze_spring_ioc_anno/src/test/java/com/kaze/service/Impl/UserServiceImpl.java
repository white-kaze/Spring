package com.kaze.service.Impl;

import com.kaze.dao.UserDao;
import com.kaze.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//<bean id="userService" class="com.kaze.service.Impl.UserServiceImpl">
//<property name="userDao" ref="userDao"/>
//</bean>
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired //按照数据类型从Spring容器中进行匹配
//    @Qualifier("userDao")
//    @Resource(name="userDao)=@Autowird+@Qualifier
    private UserDao userDao;
//    注解方式可不写set方法
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void save() {
        userDao.save();
    }
}
