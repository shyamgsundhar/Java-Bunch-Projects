package com.kovanlabs.ecommercespringmvc.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
public class JDBCConfig {

    private static final Logger logger = LoggerFactory.getLogger(JDBCConfig.class);

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    public Connection getConnection() throws Exception {
        logger.info("Connecting to database...");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);

        logger.info("Database connected successfully!");
        return conn;
    }
}