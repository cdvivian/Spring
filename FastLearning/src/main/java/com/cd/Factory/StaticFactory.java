package com.cd.Factory;

import com.cd.DAO.UserDao;
import com.cd.Impl.UserDaoImpl;

/**
 * @author cdviviany
 * @version 1.00
 */
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }

}
