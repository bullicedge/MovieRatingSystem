package com.springboot.demo.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class GenericResponse {

    boolean apiSuccessStatus;
    String apiMessage;
}
