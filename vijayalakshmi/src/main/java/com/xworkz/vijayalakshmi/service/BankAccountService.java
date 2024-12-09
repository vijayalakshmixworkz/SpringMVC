package com.xworkz.vijayalakshmi.service;

import com.xworkz.vijayalakshmi.dto.BankAccountDTO;
import org.springframework.stereotype.Service;

@Service
public interface BankAccountService {
    boolean create(BankAccountDTO bankAccountDTO);
}
