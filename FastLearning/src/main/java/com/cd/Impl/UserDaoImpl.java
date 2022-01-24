package com.cd.Impl;

import com.cd.DAO.UserDao;
import com.cd.Domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author cdviviany
 * @version 1.00
 */
public class UserDaoImpl implements UserDao {
    private List<String> stringList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }



    //    private String gender;
//    private int age;
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    @Override
    public void save() {
        System.out.println(stringList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running...");
//        System.out.println(gender+"=="+age);
    }
//    public void init(){
//        System.out.println("初始化。。。");
//    }
//    public void destroy(){
//        System.out.println("毁灭啦");
//    }
}
