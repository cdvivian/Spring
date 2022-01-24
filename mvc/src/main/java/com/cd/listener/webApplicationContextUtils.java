package com.cd.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @author cdviviany
 * @version 1.00
 */
public class webApplicationContextUtils {
    public static ApplicationContext getApplicationContext(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("app");
    }
}
