package com.valyou.valyou.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
class CreateAccountRequest {
    private String email;
    private String password;
    private String phoneNumber;
    private Role role;
}