package com.springboot.demo.controller;

import com.springboot.demo.dto.request.RequestUser;
import com.springboot.demo.dto.response.GenericResponse;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

@Autowired
UserService userService;

@PostMapping("/createuser")
    public GenericResponse createUser(@RequestBody RequestUser requestUser){
 System.out.println("controller" + requestUser.toString());
    return userService.createUser(requestUser);
}

}
