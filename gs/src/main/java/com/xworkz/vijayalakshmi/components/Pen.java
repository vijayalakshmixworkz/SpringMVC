package com.xworkz.vijayalakshmi.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@RequestMapping("/")
@EnableWebMvc
public class Pen {
  public Pen(){
      System.out.println("pen is created");
  }
  @RequestMapping("/press")
    public String onPress()
    {
        System.out.println("onPress is running");
        return "index.jsp";
    }
}
