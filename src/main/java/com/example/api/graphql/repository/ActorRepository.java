package com.example.api.graphql.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.api.graphql.record.Actor;

import jakarta.annotation.PostConstruct;

@Repository
public class ActorRepository {

	private List<Actor> mockActors;
	private MovieRepository movieRepository;

	public ActorRepository(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	@PostConstruct
	private void initializeMockActors() {
		this.mockActors = new ArrayList<>(List.of(
				new Actor(1L, "Keanu Reeves",
						List.of(movieRepository.getById(1L), movieRepository.getById(2L), movieRepository.getById(3L))),
				new Actor(2L, "Laurence Fishburne", List.of(movieRepository.getById(1L), movieRepository.getById(2L),
						movieRepository.getById(3L)))));

	}

	public Actor getById(Long id) {
		return mockActors.stream().filter(actor -> actor.id().equals(id)).findFirst().orElse(null);
	}

}
