package com.RetailFlow.service;

import com.RetailFlow.exceptions.UserException;
import com.RetailFlow.modal.User;

import java.util.List;

public interface UserService {
    User getUserFromJwtToken(String token) throws UserException;
    User getCurrentUser() throws UserException;
    User getUserByEmail(String email) throws UserException;
    User getUserById(Long id);
    List<User> getAllUsers();


}
