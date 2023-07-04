package com.example.api.graphql.record;

import java.util.List;

public record Movie(Long id, String title, int year, List<String> genres, String director) {

}
