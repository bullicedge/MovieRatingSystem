package com.springboot.demo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ResponseMovie extends  GenericResponse{
        Integer id;
        String name;
        String releaseDate;
    }


