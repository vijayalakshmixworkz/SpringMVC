package com.xworkz.vijayalakshmi.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ScholarshipDTO {

    private String fullName;
    private String email;
    private long phoneNumber;
    private String courseName;
    private double academicScore;
}
