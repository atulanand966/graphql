query {
  movieById(id: 1) {
    id
    title
    year
    genres
    director
  }
}

mutation {
  addMovie(
    id: 4
    title: "Inception"
    year: 2010
    genres: ["Action", "SciFi"]
    director: "Christopher Nolan"
  ) {
    id
    title
    year
    genres
    director
  }
}
