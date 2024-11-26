package com.xworkz.initializer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class ApplicationConfiguration {

public ApplicationConfiguration(){
    System.out.println("Running configuration class");
}
    @Bean
    public String teamName()
    {
        return "RCB";
    }
    @Bean
    public Double budget(){
        return 2.34;
    }
    @Bean
    public String ownerName(){
        return "Om";
    }
    @Bean
    public Double batCost(){
        return 38689.355;
    }
    @Bean
    public Double ballCost(){
        return 386.355;
    }
}
