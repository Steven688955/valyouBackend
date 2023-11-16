package com.valyou.valyou.models;

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
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String phoneNumber;
    private String email;
    private String nationality;
    private String region;
    private String zone;
    private String city;
    private String subCity;
    private String woreda;

    private String houseNumber;

}
