package com.springboot.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name ="user")
public class User {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name="increment", strategy ="increment")
    Integer id;
    String fname;
    String lname;
    String phoneNo;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userId", cascade = CascadeType.ALL)
    List<Address> address;
    Boolean isActive;
    Role role;
}
