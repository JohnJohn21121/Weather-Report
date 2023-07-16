package com.JohnJohn21121.CanDoItWeatherReport.controller;

import com.JohnJohn21121.CanDoItWeatherReport.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class HomeController {

    @Autowired
    private UserService userService;



    @GetMapping("")
    public String viewHomePage(Model model) {
        String successMessage = (String) model.getAttribute("successMessage");
        if (successMessage != null) {
            model.addAttribute("successMessage", successMessage);
        }

        return "index";
    }


}
