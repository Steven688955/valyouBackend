package com.valyou.valyou.models;

import com.valyou.valyou.user.Users;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private String name;
    private String description;
    private String website;
    @OneToOne(cascade = CascadeType.ALL)
    private Users users;
}
