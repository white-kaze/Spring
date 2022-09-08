package com.kaze.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

// 标志该类时Spring的核心配置类
@Configuration

//<!-- 配置组件扫描注解bean   -->
//<context:component-scan base-package="com.kaze"/>

@ComponentScan("com.kaze")

@Import({DataSourceConfiguration.class})
public class SpringConfiguration {

}
