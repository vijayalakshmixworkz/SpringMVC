package com.xworkz.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Team {

    @Autowired
    public String teamName;

    public Team() {
        System.out.println("team created");
    }


}
