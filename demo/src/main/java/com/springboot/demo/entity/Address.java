package com.springboot.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name ="address")
public class Address {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name="increment", strategy ="increment")
    Integer Id;
    String fullAddress;
    String zipCode;
    String city;
    String state;
    Boolean isActive;
    String country;

    @ManyToOne
    @JoinColumn(name = "userId")
    User userId;



}
