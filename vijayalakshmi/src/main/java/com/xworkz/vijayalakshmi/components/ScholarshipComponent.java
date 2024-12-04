package com.xworkz.vijayalakshmi.components;

import com.xworkz.vijayalakshmi.dto.ScholarshipDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ScholarshipComponent {

    public ScholarshipComponent() {
        System.out.println("ScholarshipComponent created");
    }

    @PostMapping("/Submit")
    public String submit(ScholarshipDTO scholarshipDTO) {
        System.out.println("Scholarship application submitted");
        System.out.println("Received ScholarshipApplicationDTO: " + scholarshipDTO);
        return "Scholarship.jsp"; // Ensure this JSP exists
    }
}
