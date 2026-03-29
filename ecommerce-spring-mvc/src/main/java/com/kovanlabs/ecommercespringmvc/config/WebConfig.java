package com.kovanlabs.ecommercespringmvc.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.kovanlabs.ecommercespringmvc")
public class WebConfig implements WebMvcConfigurer {
}