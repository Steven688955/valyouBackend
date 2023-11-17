package com.valyou.valyou.security;

import com.valyou.valyou.user.Users;
import com.valyou.valyou.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;


@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
        Users user = userRepository.findByEmailOrUsername(usernameOrEmail, usernameOrEmail);

        if (user != null) {
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(user.getRole().getRoleName()));
            System.out.println("user name: " + user.getUsername());
            System.out.println("password: " + user.getPassword());
            System.out.println("is enabled: " + user.getIsEnabled());
            return new CustomUserDetails(
                    user.getUserId(), // Add the userId to the constructor
                    user.getUsername(),
                    user.getPassword(),
                    user.getIsEnabled(),
                    true,
                    true,
                    authorities
            );
        }
        throw new UsernameNotFoundException("User '" + usernameOrEmail + "' not found");
    }
}

