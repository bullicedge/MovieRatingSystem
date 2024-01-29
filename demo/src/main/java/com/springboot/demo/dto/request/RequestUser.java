package com.springboot.demo.dto.request;

import com.springboot.demo.entity.Address;
import com.springboot.demo.entity.Role;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RequestUser {

    Integer id;

    String fname;
    String lname;
    String phoneNo;

    List<RequestAddress> address;

    Boolean isActive;
    String role;


}
