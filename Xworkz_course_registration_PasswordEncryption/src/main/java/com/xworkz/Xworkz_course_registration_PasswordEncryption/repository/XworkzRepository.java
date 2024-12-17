package com.xworkz.Xworkz_course_registration_PasswordEncryption.repository;

import com.xworkz.Xworkz_course_registration_PasswordEncryption.entity.XworkzEntity;
public interface XworkzRepository {
    boolean onSave(XworkzEntity entity);
    String getNameByEmailAndPassword(String email, String password);
    XworkzEntity findByEmail(String email);
}