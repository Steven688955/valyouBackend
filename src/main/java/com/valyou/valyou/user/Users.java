package com.valyou.valyou.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Collection;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Users implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String username;
    private String phoneNumber;
    private String password;
    private String fullName;
    private String email;
    private Boolean emailConfirmed;
    private String gender;
    private String birthDate;
    private String imageUrl;
    private String coverImgUrl;
    private String ip;
    private String createdAt;
    private String deletedAt;
    private Integer languageCode;
    private Integer accessFailedCount;
    private Boolean twoFactorEnabled;
    private Boolean isEnabled;
    private Boolean isAccountNonLocked;
    private Boolean isAccountNonExpired;
    private Boolean isCredentialsNonExpired;

    //user address
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    //user roles
    @OneToOne(fetch = FetchType.EAGER)
    private Role role;

    public Users orElseThrow(Object object) {
        return null;
    }

    public Users(String username, String email, String password, String phoneNumber, Role role) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.email = email;
        this.password = new BCryptPasswordEncoder().encode(password);

    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", emailConfirmed=" + emailConfirmed +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", ip='" + ip + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", deletedAt='" + deletedAt + '\'' +
                ", languageCode=" + languageCode +
                ", accessFailedCount=" + accessFailedCount +
                ", twoFactorEnabled=" + twoFactorEnabled +
                ", isEnabled=" + isEnabled +
                ", isAccountNonLocked=" + isAccountNonLocked +
                ", isAccountNonExpired=" + isAccountNonExpired +
                ", isCredentialsNonExpired=" + isCredentialsNonExpired +
                ", address=" + address +
                ", role=" + role +
                '}';
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.isEnabled;
    }
}
