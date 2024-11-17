package com.example.booking.bookingautomation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @GetMapping("/getdetails")
    public String getDetails()
    {
        return "Hi main";
    }
}
