package com.valyou.valyou.security;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class CustomUserDetails extends org.springframework.security.core.userdetails.User {
    private Long userId;

    public CustomUserDetails(Long userId, String username, String password, boolean enabled,
                             boolean accountNonExpired, boolean credentialsNonExpired,
                             Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, true, authorities);
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}