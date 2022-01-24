package com.cd.Demo;

import com.cd.Impl.UserServiceImpl;
import com.cd.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cdviviany
 * @version 1.00
 */
public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("UserService");
        userService.save();
    }
}
