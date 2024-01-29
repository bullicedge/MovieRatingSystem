package com.springboot.demo.controller;

import com.springboot.demo.dto.request.RequestUser;
import com.springboot.demo.dto.response.GenericResponse;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/user")
public class UserController {

@Autowired
UserService userService;


    Logger LOG = Logger.getLogger(UserController.class.getName());
@PostMapping("/createuser")
    public GenericResponse createUser(@RequestBody RequestUser requestUser){
 //System.out.println("controller" + requestUser.toString());
    LOG.info("controller" + requestUser.toString());
    LOG.info("jfdkfjhd");
    return userService.createUser(requestUser);
}

}
