package com.cd.Dao.impl;

import com.cd.Dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author cdviviany
 * @version 1.00
 */
//@Component("userDao")
    @Repository("userDao")
public class UserDaoImp implements UserDao {
    public void save() {
        System.out.println("正在运行中");
    }
}
