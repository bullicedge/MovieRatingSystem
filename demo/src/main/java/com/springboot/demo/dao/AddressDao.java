package com.springboot.demo.dao;

import com.springboot.demo.entity.Address;
import com.springboot.demo.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDao {

    @PersistenceContext
    EntityManager entityManager;

    public void createAddress(Address address){
        entityManager.persist(address);
        entityManager.flush();

    }
}
