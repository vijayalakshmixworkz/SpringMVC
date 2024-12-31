package com.xworkz.commonModule.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
    private String name;
    private String email;
    private String alternative_email;
    private String phone;
    private String alternative_phone;
    private String location;
}

