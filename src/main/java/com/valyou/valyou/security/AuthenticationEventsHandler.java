package com.valyou.valyou.security;

import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationEventsHandler implements AuthenticationEventPublisher {


    @Override
    public void publishAuthenticationSuccess(Authentication authentication) {
        //TODO: here we will notify user that someone has logged in to his account
        System.out.println("user authenticated!");
    }

    @Override
    public void publishAuthenticationFailure(AuthenticationException exception, Authentication authentication) {
        //TODO: here we will notify user that someone has tried to login to the account
        //TODO: count down the trial time here
        System.out.println("user not authenticated!");
    }
}
