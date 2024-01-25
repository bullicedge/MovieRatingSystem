package com.springboot.demo.dao;

import com.springboot.demo.entity.Movie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDao {
    @PersistenceContext
    EntityManager entityManager;

    public void crateMovie(Movie movie){
        entityManager.persist(movie);
        entityManager.flush();


    }

    public Movie findMovieById(Integer id){

        return entityManager.find(Movie.class,id);
    }

    public void updateMovieDetails(Movie mv){
        entityManager.persist(mv);
        entityManager.flush();

    }
    public Movie getByID(Integer id){
        return entityManager.find(Movie.class,id);
    }


}
