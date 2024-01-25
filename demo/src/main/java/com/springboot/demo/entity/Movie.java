package com.springboot.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="movie")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Movie {

    @jakarta.persistence.Id
            @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
            @GenericGenerator(name="increment", strategy ="increment")
    Integer id;
    String name;
    String releaseDate;


}
