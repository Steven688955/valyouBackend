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
    public Address(String phoneNumber, String email, String nationality, String city, String subCity, String woreda, String houseNumber){
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.nationality =nationality;
        this.city = city;
        this.subCity= subCity;
        this.woreda= woreda;
        this.houseNumber=houseNumber;
    }
    public Address(String phoneNumber, String email, String city, String subCity, String woreda, String houseNumber) {
        this(phoneNumber,email, "Ethiopia", city, subCity, woreda, houseNumber );
    }
}
