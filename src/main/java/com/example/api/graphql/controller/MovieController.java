package com.example.api.graphql.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.api.graphql.record.Movie;
import com.example.api.graphql.repository.MovieRepository;

@Controller
public class MovieController {

	private final MovieRepository movieRepository;
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @QueryMapping
    public Movie movieById(@Argument Long id) {
        return movieRepository.getById(id);
    }

    @MutationMapping
    public Movie addMovie(@Argument Long id, @Argument String title, @Argument Integer year, @Argument List<String> genres,
                          @Argument String director) {

        Movie movie = new Movie(id, title, year, genres, director);
        movieRepository.addMovie(movie);
        return movie;
    }
}
