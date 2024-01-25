package com.springboot.demo.controller;

import com.springboot.demo.dto.request.RequestMovie;
import com.springboot.demo.dto.response.GenericResponse;
import com.springboot.demo.dto.response.ResponseMovie;
import com.springboot.demo.entity.Movie;
import com.springboot.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieService movieService;
@PostMapping("/add/movie")
    public GenericResponse addMovie(@RequestBody RequestMovie requestMovie){

       // return movieService.addMovie(requestMovie);
    return movieService.addMovieviaJpa(requestMovie);
    }

    @GetMapping("/findbyid/{id}")
    public ResponseMovie findMovieById(@PathVariable Integer id){

    return  movieService.findbyID(id);
    }

    @PutMapping("/update/{id}/{name}")
    public GenericResponse UpdateMovie(@PathVariable("id")
                                            Integer id,@PathVariable("name")
                                            String name){

        return movieService.updateMovie(id,name);

    }


}
