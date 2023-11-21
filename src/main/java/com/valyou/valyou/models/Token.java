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
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private Integer amount;
    @ManyToOne(cascade = CascadeType.ALL)
    private Users users;

}
