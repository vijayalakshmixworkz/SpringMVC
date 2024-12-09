package com.xworkz.vijayalakshmi.components;

import com.xworkz.vijayalakshmi.dto.HotelDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@EnableWebMvc
@RequestMapping("/")
public class HotelRoomComponent {
    public  HotelRoomComponent(){
        System.out.println("HotelRoomComponent created");
    }
    @RequestMapping("/Book")
    public String onPress(HotelDTO hotelDTO)
    {
        System.out.println("onPress created");
        System.out.println("HotelDTO"+hotelDTO);
        return "HotelBook.jsp";
    }
}
