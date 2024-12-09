package com.xworkz.vijayalakshmi.service;

import com.xworkz.vijayalakshmi.dto.PassportDTO;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService {
    public PassportServiceImpl(){
        System.out.println("PassportServiceImpl is created");
    }
    @Override
    public boolean pass(PassportDTO passportDTO) {
        return false;
    }
}
