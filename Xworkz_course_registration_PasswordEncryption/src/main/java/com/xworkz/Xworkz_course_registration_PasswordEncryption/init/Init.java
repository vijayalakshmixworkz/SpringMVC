package com.xworkz.Xworkz_course_registration_PasswordEncryption.init;
import com.xworkz.Xworkz_course_registration_PasswordEncryption.configuration.Configure;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Init extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    public Init(){
        System.out.println(" Init");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {Configure.class};
    }
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}