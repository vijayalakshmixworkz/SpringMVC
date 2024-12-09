package com.xworkz.vijayalakshmi.controller;

import com.xworkz.vijayalakshmi.dto.BankAccountDTO;
import com.xworkz.vijayalakshmi.service.BankAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")

public class BankAccountController {
    private BankAccountService bankAccountService;
    public BankAccountController()
    {
        System.out.println("BankAccountController is created");
    }
    @RequestMapping("/submit")
    public  String onPress(BankAccountDTO bankAccountDTO)
    {
        System.out.println("on press created");
        System.out.println("BankAccount Form"+ bankAccountDTO);
        boolean saved=this.bankAccountService.create(bankAccountDTO);
        if(saved)
        {
            System.out.println(" data save success");
        }
        else
        {
            System.out.println(" data save failed");
        }
        return "BankAccount.jsp";
    }
}
