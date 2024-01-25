package com.springboot.demo.service;

import com.springboot.demo.dao.AddressDao;
import com.springboot.demo.dao.UserDao;
import com.springboot.demo.dto.request.RequestUser;
import com.springboot.demo.dto.response.GenericResponse;
import com.springboot.demo.entity.Address;
import com.springboot.demo.entity.User;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class UserService {

    @Autowired
    UserDao userDao;
    @Autowired
    AddressDao addressDao;

    public GenericResponse createUser(RequestUser requestUser) {


        User user = new User();

        Address address = new Address();

        user.setFname(requestUser.getFname());
        user.setLname(requestUser.getLname());
        user.setIsActive(requestUser.getIsActive());
        //user.setRole(requestUser.getRole());

        userDao.createUser(user);
        address.setFullAddress(requestUser.getAddress().get(0).getFullAddress());
        address.setCity(requestUser.getAddress().get(0).getCity());
        address.setUserId(user);

        addressDao.createAddress(address);

        return new GenericResponse(true,"User Created Successfully");


    }

}
