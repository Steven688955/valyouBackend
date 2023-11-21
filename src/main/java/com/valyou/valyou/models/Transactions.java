package com.valyou.valyou.models;

import com.valyou.valyou.user.Users;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    private Double amount;
    private Date date;
    @OneToOne
    private TransactionType transactionType;
    @ManyToOne(cascade = CascadeType.ALL)
    private Users user;
}
