package com.xworkz.commonModule.controller;

import com.xworkz.commonModule.constants.LocationConstants;
import com.xworkz.commonModule.dto.UserDTO;
import com.xworkz.commonModule.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class SignUpController {
    @Autowired
    private UserService userService;
   public SignUpController()
    {
        System.out.println("SignUpController created");
    }
    @PostMapping("/signup")
    public String onSignUp(UserDTO userDTO, Model model)
    {
        System.out.println("signup created");
        System.out.println(userDTO);
        String signUpData=userService.onsave(userDTO);
        model.addAttribute("message","success");
        return "signup";
    }
    @GetMapping(value = "/signUpAgain")
    public String signUpAgain(Model model){
        List<LocationConstants> locationList=new ArrayList<>(Arrays.asList(LocationConstants.values()));
        locationList.forEach(n-> System.out.println(n));
        model.addAttribute("locationListSend",locationList);
        return "signup";
    }

}
