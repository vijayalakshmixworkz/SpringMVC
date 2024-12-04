package com.xworkz.vijayalakshmi.components;
import com.xworkz.vijayalakshmi.dto.JobDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JobComponent {

    public JobComponent() {
        System.out.println("JobComponent created");
    }

    @PostMapping("/Apply")
    public String apply(JobDTO jobDTO) {
        System.out.println("Job application initiated");
        System.out.println("Received JobDTO: " + jobDTO);
        return "Job.jsp";
    }
}
