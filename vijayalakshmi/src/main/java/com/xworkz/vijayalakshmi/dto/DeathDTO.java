package com.xworkz.vijayalakshmi.dto;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@ToString
public class DeathDTO {
    private String  deseasedName;
    private int deseasedAge;
    private String deseasedAddress;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private String  deseasedDOB;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private String  deseasedLastDate;
    private String  deseasedCause;
}
