package com.kovanlabs.handleinterceptor.config;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import org.slf4j.bridge.SLF4JBridgeHandler;

@WebListener
public class LoggingInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        System.out.println("Logback bridge initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}