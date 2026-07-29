package com.RetailFlow.controller;

import com.RetailFlow.exceptions.UserException;
import com.RetailFlow.mapper.UserMapper;
import com.RetailFlow.modal.User;
import com.RetailFlow.payload.dto.UserDto;
import com.RetailFlow.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/profile")
    public ResponseEntity<UserDto> getUserProfile(
            @RequestHeader("Authorization") String jwt
    ) throws UserException {
        User user = userService.getUserFromJwtToken(jwt);
        return ResponseEntity.ok(UserMapper.toDTO(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(
            @RequestHeader("Authorization") String jwt,
            @PathVariable Long id
    ) throws UserException {
        User user = userService.getUserById(id);
        return ResponseEntity.ok(UserMapper.toDTO(user));
    }
}
