package com.valyou.valyou.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class TransactionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionTypeId;
    private String transactionTypeName;
    private String transactionTypeDescription;
}
