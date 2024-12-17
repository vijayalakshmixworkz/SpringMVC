package com.xworkz.Xworkz_course_registration_PasswordEncryption.service;

import com.xworkz.Xworkz_course_registration_PasswordEncryption.dto.XworkzDTO;
import com.xworkz.Xworkz_course_registration_PasswordEncryption.entity.XworkzEntity;
import java.util.Map;
public interface XwrokzService {
    boolean save(XworkzDTO dto);
    Map<String, String> validate(XworkzDTO dto);
    boolean getValidationErrors(XworkzDTO dto);
    String getNameByEmailAndPassword(String email, String password);
    XworkzEntity getUserByEmailAndPassword(String email, String password);
}