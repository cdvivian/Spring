package com.cd.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author cdviviany
 * @version 1.00
 */
public class ServletListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        String confi = servletContext.getInitParameter("contextconfiguration");
        ApplicationContext app = webApplicationContextUtils.getApplicationContext(servletContext);
        servletContext.setAttribute("app",app);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
