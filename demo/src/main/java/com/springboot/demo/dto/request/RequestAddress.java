package com.springboot.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RequestAddress {

    Integer Id;
    String fullAddress;
    String zipCode;
    String city;
    String state;
    Boolean isActive;
    String country;
}
