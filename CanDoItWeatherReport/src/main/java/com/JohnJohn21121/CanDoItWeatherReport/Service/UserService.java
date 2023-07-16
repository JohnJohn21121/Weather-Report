package com.JohnJohn21121.CanDoItWeatherReport.Service;

import com.JohnJohn21121.CanDoItWeatherReport.dto.UserDto;
import com.JohnJohn21121.CanDoItWeatherReport.dto.UserResponseDto;
import com.JohnJohn21121.CanDoItWeatherReport.exceptions.UserException;
import com.JohnJohn21121.CanDoItWeatherReport.model.User;
import com.JohnJohn21121.CanDoItWeatherReport.repository.UserRepository;
import com.JohnJohn21121.CanDoItWeatherReport.utils.Utils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private Utils utils;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponseDto registerNewUserAccount(UserDto userDto) {

        if (utils.emailExists(userDto.getEmail())) {
            throw new UserException("There´s an existing account using the email " + userDto.getEmail() +
                    ", please log In or register withe a new email");
        }


        User user = modelMapper.map(userDto, User.class);
        User savedUser = userRepository.save(user);
        UserResponseDto responseDto = modelMapper.map(savedUser, UserResponseDto.class);


        return responseDto;
    }



}
