package com.example.apiAnimu.controller;

import com.example.apiAnimu.domain.model.Movie;
import com.example.apiAnimu.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository  movieRepository;
    MovieController(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }
    @GetMapping("/")
    public List<Movie> findAllMovies(){
        return movieRepository.findAll();
    }
    @GetMapping("/java")
    public String talycual2(){
        return "D O L O R";
    }
    @PostMapping("/")
    public Movie createMovie(@RequestBody Movie movie){return movieRepository.save(movie);}

}
