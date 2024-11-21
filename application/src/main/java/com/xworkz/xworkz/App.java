package com.xworkz.xworkz;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class App extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

    public App() {
        System.out.println("connected");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        String[] urls = {"/"};
        System.out.println("configured urls for DispatcherServlet");
        return urls;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("enable static resource handling by server itself");
        configurer.enable();
    }
}
