package com.valyou.valyou.user;

import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<?> createUser(CreateAccountRequest createAccountRequest);
}
