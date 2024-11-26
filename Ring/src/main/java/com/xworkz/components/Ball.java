package com.xworkz.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ball {
    @Autowired
    private double batCost;

    public Ball()
    {
        System.out.println("ball created");
    }
}
