package com.xworkz.vijayalakshmi.service;

import com.xworkz.vijayalakshmi.dto.DeathDTO;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class DeathCertificateServiceImpl implements DeathCertificateService{
public DeathCertificateServiceImpl()
{
    System.out.println("DeathCertificateServiceImpl is connected");
}
    @Override
    public boolean validateSave(DeathDTO deathDTO) {
        return true;
    }
}
