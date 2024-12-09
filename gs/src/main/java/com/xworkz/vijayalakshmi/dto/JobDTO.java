package com.xworkz.vijayalakshmi.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class JobDTO {

    private String fullName;
    private String email;
    private long phoneNumber;
    private String dateOfBirth;
    private String address;
    private String highestQualification;
    private int yearsOfExperience;
    private String positionAppliedFor;
    private double expectedSalary;
    private String currentPosition;
}
