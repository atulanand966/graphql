package com.example.api.graphql.record;

import java.util.List;

public record Actor(Long id, String name, List<Movie> movies) {

}
