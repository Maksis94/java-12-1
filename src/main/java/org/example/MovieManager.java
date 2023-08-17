package org.example;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int numLast = 5;

    public MovieManager() {}

    public MovieManager(int numLast) {
        this.numLast = numLast;
    }

    public void add(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        Movie[] reversed = new Movie[movies.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }

        return reversed;
    }

    public Movie[] findLast() {
        int resultLength = numLast;
        if (movies.length < resultLength) {
            resultLength = movies.length;
        }

        Movie[] reversed = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }

        return reversed;
    }
}