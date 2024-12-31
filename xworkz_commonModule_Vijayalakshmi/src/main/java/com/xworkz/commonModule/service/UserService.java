package com.xworkz.commonModule.service;

import com.xworkz.commonModule.dto.UserDTO;
import com.xworkz.commonModule.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String onsave(UserDTO userDTO);
    String getNameByEmailAndPassword(String email,String password);
    Long countName(String name);
    Long countByEmail(String email);
    Long countByAltEmail(String altEmail);
    Long countByPhone(String phone);
    Long countByAltPhone(String altPhone);
    Long countByLocation(String location);
}
