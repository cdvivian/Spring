package com.cd.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author cdviviany
 * @version 1.00
 */
//标志该类是spring的核心配置类
@Configuration
@ComponentScan("com.cd")
@PropertySource("classpath:druid.properties")
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {

}
