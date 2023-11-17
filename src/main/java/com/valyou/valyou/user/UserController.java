package com.valyou.valyou.user;

import com.valyou.valyou.DTO.ResponseMessage;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    ResponseEntity<?> createUser(@RequestBody CreateAccountRequest createAccountRequest) {
        return userService.createUser(createAccountRequest);
    }


}

