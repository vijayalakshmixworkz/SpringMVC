package com.xworkz.commonModule.configuration;

//import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
//@Slf4j
@Configuration
@ComponentScan("com.xworkz.commonModule")
@EnableWebMvc
public class UserConfiguration
{
    public UserConfiguration()
    {
        System.out.println(" UserConfiguration is created");
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean()
    {
        LocalContainerEntityManagerFactoryBean local=new LocalContainerEntityManagerFactoryBean();
        //log.info(" this is common module log");
        local.setPackagesToScan("com.xworkz.commonModule.entity");
        local.setDataSource(dataSource());
        local.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return local;
    }
    @Bean
    public ViewResolver viewResolver(){
        return new InternalResourceViewResolver("/",".jsp");
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource= new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("7483381416");
        dataSource.setUrl("jdbc:mysql://localhost:3306/commonmodule");
        return dataSource;
    }
}
