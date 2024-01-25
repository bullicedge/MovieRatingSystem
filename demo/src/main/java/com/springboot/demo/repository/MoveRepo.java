package com.springboot.demo.repository;

import com.springboot.demo.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoveRepo  extends JpaRepository<Movie,Integer> {
}
