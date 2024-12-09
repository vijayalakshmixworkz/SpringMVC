package com.xworkz.vijayalakshmi.components;

import com.xworkz.vijayalakshmi.dto.OrganDonationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OrganDonationComponent {

    public OrganDonationComponent() {
        System.out.println("OrganDonationComponent created");
    }

    @PostMapping("/donate")
    public String donate(OrganDonationDTO organDonationDTO) {
        System.out.println("Organ donation initiated");
        System.out.println("Received OrganDonationDTO: " + organDonationDTO);
        return "OrganDonation.jsp"; // Ensure this JSP exists
    }
}
