package com.xworkz.vijayalakshmi.dto;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrganDonationDTO {

    private String fullName;
    private String email;
    private long phoneNumber;
    private String dateOfBirth;
    private String bloodGroup;
    private String organToDonate;
    private String address;
    private long emergencyContact;
    private String medicalHistory;
    private boolean consent;
}
