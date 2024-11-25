package com.xworkz.runner;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class SpringConfigureBuilder {
    public SpringConfigureBuilder(){
        System.out.println("creating configuration SpringConfigureBuilder");
    }
}
