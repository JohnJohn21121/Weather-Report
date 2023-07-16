package com.JohnJohn21121.CanDoItWeatherReport.utils;

import com.JohnJohn21121.CanDoItWeatherReport.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class Utils {

    @Autowired
    UserRepository userRepository;

    public static boolean isValidPassword(String password){

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=\\S+$).{6,24}$";


        Pattern p = Pattern.compile(regex);

        if (password == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);

        // Return if the password
        // matched the ReGex
        return m.matches();
    }

    public boolean emailExists(String email) {
        return userRepository.findByEmail(email) != null;
    }
}
