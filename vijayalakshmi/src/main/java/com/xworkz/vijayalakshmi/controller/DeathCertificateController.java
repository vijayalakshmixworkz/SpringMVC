package com.xworkz.vijayalakshmi.controller;

import com.xworkz.vijayalakshmi.dto.DeathDTO;
import com.xworkz.vijayalakshmi.service.DeathCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@RequestMapping("/")

public class DeathCertificateController {
    @Autowired
    private DeathCertificateService deathCertificateService;
    public DeathCertificateController()
    {
        System.out.println("DeathCertificateController is created");
    }
    @RequestMapping("/deceased")
    public  String onPress(DeathDTO deathDTO)
    {
        System.out.println("on press created");
        System.out.println("Death Certificate"+ deathDTO);
        boolean saved=this.deathCertificateService.validateSave(deathDTO);
        if(saved)
        {
            System.out.println(" data save success");
        }
        else
        {
            System.out.println(" data save failed");
        }
        return "DeathCertificate.jsp";
    }
}

