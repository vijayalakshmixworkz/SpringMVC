package com.xworkz.vijayalakshmi.service;

import com.xworkz.vijayalakshmi.dto.BankAccountDTO;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService{

public BankAccountServiceImpl(){
    System.out.println("BankAccountServiceImpl is created");
}
    @Override
    public boolean create(BankAccountDTO bankAccountDTO) {
        return false;
    }
}
