package com.RetailFlow.service;

import com.RetailFlow.exceptions.UserException;
import com.RetailFlow.payload.dto.UserDto;
import com.RetailFlow.payload.response.AuthResponse;

public interface AuthService {

    AuthResponse signup(UserDto userDto) throws UserException;
    AuthResponse login(UserDto userDto) throws UserException;
}
