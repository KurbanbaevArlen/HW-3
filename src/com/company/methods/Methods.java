package com.company.methods;

import com.company.movies.Movies;

import java.util.List;

public interface Methods {
    void findMoviesByActor(List<Movies> movies);

    void findMoviesByDirector(List<Movies> movies);

    void findMoviesByYear(List<Movies> movies, int name);

    void findMoviesAndRoleByActor(List<Movies> movies);

    void showActorRoles(List<Movies> movies);
}
