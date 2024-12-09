package com.xworkz.vijayalakshmi.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BankAccountDTO {

    private String accountHolderName;
    private Long    accountBalance;
    private Long    accountNumber;
}

