package com.valyou.valyou.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String roleName;
    private String description;
    public Role(String roleName, String description) {
        this.roleName = roleName;
        this.description = description;
    }
}
