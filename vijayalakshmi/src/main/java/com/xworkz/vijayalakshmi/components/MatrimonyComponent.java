package com.xworkz.vijayalakshmi.components;

import com.xworkz.vijayalakshmi.dto.MatrimonyDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MatrimonyComponent {

    public MatrimonyComponent() {
        System.out.println("MatrimonyComponent created");
    }

    @PostMapping("/Register")
    public String register(MatrimonyDTO matrimonyDTO) {
        System.out.println("Matrimony registration initiated");
        System.out.println("Received MatrimonyDTO: " + matrimonyDTO);
        return "Matrimony.jsp";
    }
}
