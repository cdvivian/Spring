package com.cd.Impl;

import com.cd.DAO.UserDao;
import com.cd.Service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cdviviany
 * @version 1.00
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }
    //    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void save() {
        userDao.save();
    }
}
