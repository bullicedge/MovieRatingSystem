package com.springboot.demo.service;

import com.springboot.demo.dao.AddressDao;
import com.springboot.demo.dao.UserDao;
import com.springboot.demo.dto.request.RequestUser;
import com.springboot.demo.dto.response.GenericResponse;
import com.springboot.demo.entity.Address;
import com.springboot.demo.entity.Role;
import com.springboot.demo.entity.User;
import com.springboot.demo.util.UserException;
import jakarta.transaction.Transactional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger LOGGER = LoggerFactory.getLogger(UserService.class);


    public GenericResponse createUser(RequestUser requestUser) {

LOGGER.info("Create User Request" + requestUser);
        User user = new User();

        Address address = new Address();
        try {


            if (requestUser.getFname() == null || requestUser.getFname().isEmpty()) {

                //return new GenericResponse(false,"FName can't Empty");
                throw new UserException("FName can't Empty4545");
            }
            user.setFname(requestUser.getFname());
            user.setLname(requestUser.getLname());
            user.setIsActive(requestUser.getIsActive());
            user.setRole(Role.valueOf(requestUser.getRole()));

            userDao.createUser(user);
            address.setFullAddress(requestUser.getAddress().get(0).getFullAddress());
            address.setCity(requestUser.getAddress().get(0).getCity());
            address.setUserId(user);

            addressDao.createAddress(address);

            return new GenericResponse(true, "User Created Successfully");


        }catch (UserException ex){

            return new GenericResponse(false, ex.getMessage());


        }catch (Exception ex){
            return new GenericResponse(false,ex.getMessage()+ex.getStackTrace().toString());
        }
    }


}
