package com.xworkz.vijayalakshmi.controller;

import com.xworkz.vijayalakshmi.dto.PassportDTO;
import com.xworkz.vijayalakshmi.service.PassportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")

public class PassportFormController {
    private PassportService passportService;
    public PassportFormController()
    {
        System.out.println("BankAccountController is created");
    }
    @RequestMapping("/pass")
    public  String onPress(PassportDTO passportDTO)
    {
        System.out.println("on press created");
        System.out.println("Passport Form"+ passportDTO);
        boolean saved=this.passportService.pass(passportDTO);
        if(saved)
        {
            System.out.println(" data save success");
        }
        else
        {
            System.out.println(" data save failed");
        }
        return "Passport.jsp";
    }
}
