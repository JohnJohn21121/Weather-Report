package com.JohnJohn21121.CanDoItWeatherReport.service;

import com.JohnJohn21121.CanDoItWeatherReport.dto.UserDto;
import com.JohnJohn21121.CanDoItWeatherReport.dto.UserResponseDto;
import com.JohnJohn21121.CanDoItWeatherReport.model.Role;
import com.JohnJohn21121.CanDoItWeatherReport.model.User;

import java.util.List;

public interface IUserService {

    UserResponseDto registerNewUserAccountDefault(UserDto accountDto);

    User getUserById(Integer id);

    List<User> getAllRegisteredUsers();
    List<Role> listRoles();

    void updateUser(User user);

}
