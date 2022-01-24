package com.cd.service.impl;

import com.cd.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author cdviviany
 * @version 1.00
 */
//@Component("userService")
    @Service("userService")
public class UserService implements com.cd.service.UserService {
    @Autowired//如果只有这个，spring容器找匹配的类型；用于只有一个bean时
    @Qualifier("userDao")//这是按照名称匹配，但要结合上面的一起用
    //@Resource（name="userDao"） 相当于上面两个相加
    private UserDao userDao;
    //普通属性注入
    @Value("小花")
    private String name;

    @Value("${druid.driverClassName}")
    private String driver;
//注解可以不用set
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
    @PostConstruct
    public void init(){
        System.out.println("我出生啦");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("我销毁");
    }
    public void save() {
        System.out.println(driver);
        System.out.println(name);
        userDao.save();
    }
}
