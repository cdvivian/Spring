package com.cd.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @author cdviviany
 * @version 1.00
 */
public class DataSourcetest {
    @Test
    public void test4() throws SQLException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    public void test3(){
        //spring容器产生数据源对象
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void test2(){
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");//jdbc.properties
        String driver = rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
    }
    @Test
    public void druidtest() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/test");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("cdviviany");
        DruidPooledConnection connection = druidDataSource.getConnection();
        connection.close();
    }
    @Test
    public void test1() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("cdviviany");
        Connection connection = dataSource.getConnection();
        connection.close();
    }
}
