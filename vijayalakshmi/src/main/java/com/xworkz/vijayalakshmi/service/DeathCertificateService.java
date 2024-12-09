package com.xworkz.vijayalakshmi.service;

import com.xworkz.vijayalakshmi.dto.DeathDTO;
import org.springframework.stereotype.Service;

@Service
public interface DeathCertificateService {
    boolean validateSave(DeathDTO deathDTO);

}
