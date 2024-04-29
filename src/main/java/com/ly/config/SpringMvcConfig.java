package com.ly.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.ly.Controller","com.ly.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
