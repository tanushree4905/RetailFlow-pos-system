package com.RetailFlow.service.impl;

import com.RetailFlow.configuration.JwtProvider;
import com.RetailFlow.exceptions.UserException;
import com.RetailFlow.modal.User;
import com.RetailFlow.repository.UserRepository;
import com.RetailFlow.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;

    @Override
    public User getUserFromJwtToken(String token) throws UserException {
        String email= jwtProvider.getEmailFromToken(token);
        User user = userRepository.findByEmail(email);
        if(user == null){
            throw new UserException("Invalid Token");
        }
        return user;
    }

    @Override
    public User getCurrentUser() throws UserException {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByEmail(email);
        if(user == null){
            throw new UserException("User Not Found");
        }
        return user;
    }

    @Override
    public User getUserByEmail(String email) throws UserException {
        User user = userRepository.findByEmail(email);
        if(user == null){
            throw new UserException("User Not Found");
        }
        return user;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
