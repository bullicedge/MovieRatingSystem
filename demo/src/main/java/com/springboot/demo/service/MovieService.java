package com.springboot.demo.service;

import com.springboot.demo.dao.MovieDao;
import com.springboot.demo.dto.request.RequestMovie;
import com.springboot.demo.dto.response.GenericResponse;
import com.springboot.demo.dto.response.ResponseMovie;
import com.springboot.demo.entity.Movie;
import com.springboot.demo.repository.MoveRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Transactional
@Repository
public class MovieService {

    @Autowired
    MovieDao movieDao;
    @Autowired
    MoveRepo moveRepo;
    public GenericResponse addMovie(RequestMovie requestMovie){
        Movie movie = new Movie();
        movie.setName(requestMovie.getName());
        movie.setReleaseDate(requestMovie.getReleaseDate());
        movieDao.crateMovie(movie);

        GenericResponse genericResponse = new GenericResponse();
        genericResponse.setApiMessage("Movie Added Successfully");
        genericResponse.setApiSuccessStatus(true);
        return genericResponse;

    }

    public ResponseMovie findbyID(Integer id){

        //Movie movie= movieDao.findMovieById(id);
        Movie movie = moveRepo.findById(id).get();
        ResponseMovie responseMovie = new ResponseMovie();
        responseMovie.setName(movie.getName());
        responseMovie.setId(movie.getId());
        responseMovie.setReleaseDate(movie.getReleaseDate());
        responseMovie.setApiSuccessStatus(true);
        responseMovie.setApiMessage("Fetch successfully ");
           return  responseMovie;


}

    public GenericResponse updateMovie(Integer id, String name){
      // String movie= movieDao.updateMovieDetails(id,name);
        Movie movie =movieDao.getByID(id);
        movie.setName(name);
        movieDao.updateMovieDetails(movie);
        GenericResponse genericResponse = new GenericResponse();
        genericResponse.setApiMessage("Movie updated Successfully");
        genericResponse.setApiSuccessStatus(true);
        return genericResponse;

    }

    public GenericResponse addMovieviaJpa(RequestMovie requestMovie){
        Movie movie = new Movie();
        movie.setName(requestMovie.getName());
        movie.setReleaseDate(requestMovie.getReleaseDate());
        moveRepo.save(movie);

        GenericResponse genericResponse = new GenericResponse();
        genericResponse.setApiMessage("Movie Added Successfully");
        genericResponse.setApiSuccessStatus(true);
        return genericResponse;

    }


}
