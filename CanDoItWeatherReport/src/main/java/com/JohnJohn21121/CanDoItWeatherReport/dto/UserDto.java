package com.JohnJohn21121.CanDoItWeatherReport.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String password;

    private String matchingPassword;

    @NotNull
    @Pattern(regexp=".+@.+\\..+", message="Please enter a valid email address")
    private String email;

}
