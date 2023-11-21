package com.valyou.valyou.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;
    private Long price;
    private Boolean availability;
    @ManyToOne(cascade = CascadeType.ALL)
    private Artist artist;
}
