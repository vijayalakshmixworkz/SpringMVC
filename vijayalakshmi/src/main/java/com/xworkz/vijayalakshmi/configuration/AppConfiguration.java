package com.xworkz.vijayalakshmi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.vijayalakshmi")
@Configuration
public class AppConfiguration {
    public AppConfiguration()
    {
        System.out.println("AppConfiguration is running");
    }
}
