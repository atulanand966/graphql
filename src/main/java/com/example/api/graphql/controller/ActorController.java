package com.example.api.graphql.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.api.graphql.record.Actor;
import com.example.api.graphql.repository.ActorRepository;

@Controller
public class ActorController {

	private final ActorRepository actorRepository;

    public ActorController(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @QueryMapping
    public Actor actorById(@Argument Long id) {
        return actorRepository.getById(id);
    }
}
