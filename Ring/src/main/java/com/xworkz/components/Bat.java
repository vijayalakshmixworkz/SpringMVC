package com.xworkz.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bat {
    @Autowired
    private double ballCost;

    public Bat()
    {
        System.out.println("Bat created");
    }
}
