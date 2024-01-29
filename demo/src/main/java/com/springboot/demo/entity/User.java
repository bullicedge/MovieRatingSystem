package com.springboot.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
    @Enumerated(EnumType.STRING)
            @Column(name="Role", columnDefinition = "varchar(255) default 'NO_ACCESS'")
    Role role;
}
