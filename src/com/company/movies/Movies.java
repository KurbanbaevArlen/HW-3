package com.company.movies;

import com.company.classes.Cast;

import java.util.List;

public class Movies {
    private String name;
    private int yearOfIssue;
    private String director;
    private List<Cast> cast;

    public void printCast(){
        int counter = 1;
        for (Cast c:cast) {
            System.out.printf("%) FullName: %s\\n\"", counter, c.getFullName());
            System.out.println("  Role: "+ c.getRole());
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", director='" + director + '\'' +
                ", cast=" + cast +
                '}';
    }
}
