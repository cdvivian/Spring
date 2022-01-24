package com.cd.test;

import com.cd.DAO.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cdviviany
 * @version 1.00
 */
public class SpringTest {
    @Test
    public void test1(){
        //测试scope属性
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) app.getBean("UserDao");
        UserDao userDao2 = (UserDao) app.getBean("UserDao");
        System.out.println(userDao1);
        System.out.println(userDao2);
    }
    @Test
    public void test2(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) app.getBean("UserDao");
        app.close();
    }

}
