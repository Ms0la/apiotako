package com.example.apiAnimu.controller;

import com.example.apiAnimu.domain.model.Actor;
import com.example.apiAnimu.domain.model.Movie;
import com.example.apiAnimu.repository.ActorRepository;
import com.example.apiAnimu.repository.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {

    private final ActorRepository actorRepository;
    ActorController(ActorRepository actorRepository){
        this.actorRepository = actorRepository;
    }
    @GetMapping("/")
    public List<Actor> findAllActors(){
        return actorRepository.findAll();
    }

}

