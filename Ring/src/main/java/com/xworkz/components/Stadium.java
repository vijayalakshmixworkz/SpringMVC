package com.xworkz.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stadium {

    private double budget;
    public Stadium()
    {
        System.out.println(" stadium component created");
    }
}
