package com.JohnJohn21121.CanDoItWeatherReport.Service;

import com.JohnJohn21121.CanDoItWeatherReport.dto.UserDto;
import com.JohnJohn21121.CanDoItWeatherReport.dto.UserResponseDto;

public interface IUserService {

    UserResponseDto registerNewUserAccount(UserDto accountDto);
}
