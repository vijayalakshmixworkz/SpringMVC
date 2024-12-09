package com.xworkz.vijayalakshmi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class PassportDTO {

   private String applicationType;
    private String passportOffice;
    private String givenName;
    private String surname;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private String dob;
    private String email;
    private String useEmailAsLogin;
    private String loginId;
    private String password;
    private String confirmPassword;
    private String hintQuestion;
    private String hintAnswer;

}







