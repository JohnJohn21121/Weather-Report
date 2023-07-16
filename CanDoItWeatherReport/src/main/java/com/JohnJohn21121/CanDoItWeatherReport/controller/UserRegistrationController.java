package com.JohnJohn21121.CanDoItWeatherReport.controller;

import com.JohnJohn21121.CanDoItWeatherReport.Service.UserService;
import com.JohnJohn21121.CanDoItWeatherReport.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("/user/registration")
public class UserRegistrationController {

    @Autowired
    private UserService userService;


    @GetMapping("/form")
    public String showRegistrationForm(WebRequest request, Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registration";
    }

    @PostMapping("/register")
    public String registerUserAccount(@Valid UserDto userDto, BindingResult result,
                                      RedirectAttributes redirectAttributes,
                                      HttpServletRequest request) {
        if (result.hasErrors()) {
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.user", result);
            redirectAttributes.addFlashAttribute("user", userDto);
            return "redirect:/form";
        }

        userService.registerNewUserAccount(userDto);

        return "redirect:/registrationSuccess";
    }


    @GetMapping("/registrationSuccess")
    public String registerSuccess(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("successMessage", "Succesfully Registered!");
        return "redirect:/api/v1/home";
    }


}
