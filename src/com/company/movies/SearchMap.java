package com.company.movies;

import com.company.methods.Methods;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SearchMap implements Methods {
    @Override
    public void findMoviesByActor(List<Movies> movies) {
    scanner(movies);
    }
    private void scanner (List<Movies> movies){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter actor's name: ");
        String name = scanner.nextLine();
        movies.stream().filter(x -> x.getCast().stream().anyMatch(cast -> cast.getFullName().equalsIgnoreCase(name))).forEach(System.out::println);
    }
    @Override
    public void findMoviesByDirector(List<Movies> movies) {
        movies.stream().sorted(Comparator.comparing(Movies::getDirector)).forEach(System.out::println);
    }

    @Override
    public void findMoviesByYear(List<Movies> movies, int name) {
    movies.stream().filter(x->x.getYearOfIssue()== name).forEach(System.out::println);
    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies) {
    scanner(movies);
    }

    @Override
    public void showActorRoles(List<Movies> movies) {
        for (Movies i:movies) {
            i.printCast();
        }
    }
}
