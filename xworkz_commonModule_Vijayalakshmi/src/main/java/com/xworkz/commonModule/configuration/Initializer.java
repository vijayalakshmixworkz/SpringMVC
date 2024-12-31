package com.xworkz.commonModule.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Initializer  extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class [] {UserConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String [] {"/"};
    }
    public void  configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
