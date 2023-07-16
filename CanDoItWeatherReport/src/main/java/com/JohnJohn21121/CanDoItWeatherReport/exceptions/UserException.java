package com.JohnJohn21121.CanDoItWeatherReport.exceptions;

public class UserException extends RuntimeException{

    public UserException() {
        super();
    }

    public UserException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public UserException(final String message) {
        super(message);
    }

    public UserException(final Throwable cause) {
        super(cause);
    }
}
