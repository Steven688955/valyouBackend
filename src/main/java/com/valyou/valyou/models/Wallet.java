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
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long walletId;
    private Double accountBalance;
    @ManyToOne(cascade = CascadeType.ALL)
    private Users users;
}
