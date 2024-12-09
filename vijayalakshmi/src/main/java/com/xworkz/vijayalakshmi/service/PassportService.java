package com.xworkz.vijayalakshmi.service;

import com.xworkz.vijayalakshmi.dto.PassportDTO;
import org.springframework.stereotype.Service;

@Service
public interface PassportService {
    boolean pass(PassportDTO passportDTO);
}
