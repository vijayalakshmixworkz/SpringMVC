package com.xworkz.vijayalakshmi.dto;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MatrimonyDTO {

    private String fullName;
    private String email;
    private long phoneNumber;
    private String dateOfBirth;
    private String gender;
    private String religion;
    private String caste;
    private String address;
    private String education;
    private double annualIncome;
}
