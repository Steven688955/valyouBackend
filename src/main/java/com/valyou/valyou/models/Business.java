package com.valyou.valyou.models;

import com.valyou.valyou.user.Users;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long businessId;
    private String name;
    private String description;
    private String website;
    @OneToOne(cascade = CascadeType.ALL)
    private Users users;
}