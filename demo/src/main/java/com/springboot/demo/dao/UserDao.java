package com.springboot.demo.dao;

import com.springboot.demo.entity.Movie;
import com.springboot.demo.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @PersistenceContext
    EntityManager entityManager;

    public void createUser(User user){
        entityManager.persist(user);
        entityManager.flush();

    }

    public User findUserById(Integer id){

        return entityManager.find(User.class,id);
    }
}
