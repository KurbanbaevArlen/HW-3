package com.company.movies;

import com.company.classes.JsonID;
import com.company.methods.SortAble;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MovieStore implements SortAble {
    @Override
    public void printAllMovies(List<Movies> movies) {
        System.out.println(JsonID.getMovies());
    }

    @Override
    public void findMovie(List<Movies> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter movie name: ");
        String movieName = scanner.nextLine();
        JsonID.getMovies().stream().filter(x->x.getName().contains(movieName))
                .forEach(System.out::println);    }

    @Override
    public void sortByYear(List<Movies> movies) {
   JsonID.getMovies().stream().sorted(Comparator.comparing(Movies::getYearOfIssue)).forEach(System.out::println);
    }

    @Override
    public void sortByName(List<Movies> movies) {
  JsonID.getMovies().stream().sorted(Comparator.comparing(Movies::getName)).forEach(System.out::println);
    }

    @Override
    public void sortByDirector(List<Movies> movies) {
    JsonID.getMovies().stream().sorted(Comparator.comparing(x->x.getDirector())).forEach(System.out::println);
    }
}
