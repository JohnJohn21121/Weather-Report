package com.JohnJohn21121.CanDoItWeatherReport.controller;

import com.JohnJohn21121.CanDoItWeatherReport.model.User;
import com.JohnJohn21121.CanDoItWeatherReport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/user/")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public String listUsers(Model model) {

        List<User> listUsers = userService.getAllRegisteredUsers();
        model.addAttribute("listUsers", listUsers);

        return "users_list";
    }


}
