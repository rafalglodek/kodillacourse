package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreMain {

    public static void main(String[] args) {
        MovieStore theMovieDirectory = new MovieStore();
        //var theResultStringOfMovies = theMovieDirectory.getMovies().entrySet().stream()
        String theResultStringOfMovies = theMovieDirectory.getMovies().entrySet().stream()
                .flatMap(movie -> movie.getValue().stream())
                .map(String::toString)
                .collect(Collectors.joining("?","",""));

        System.out.println(theResultStringOfMovies);
    }
}




