package com.Springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbaConfig {

//    @Bean
////    public DataSource dataSource(JdbcProperties jdbcProperties) {
////        DruidDataSource druidDataSource = new DruidDataSource();
////        druidDataSource.setUrl(jdbcProperties.getUrl());
////        druidDataSource.setDriverClassName(jdbcProperties.getDriverClassName());
////        druidDataSource.setPassword(jdbcProperties.getPassword());
////        druidDataSource.setUsername(jdbcProperties.getUsername());
////        return druidDataSource;
////    }

//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")
//    public DataSource dataSource() {
//        return new DruidDataSource();
//    }
}
