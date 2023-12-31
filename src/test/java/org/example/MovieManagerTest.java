package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();
    Movie movie1 = new Movie(1, "Фильм 1");
    Movie movie2 = new Movie(2, "Фильм 2");
    Movie movie3 = new Movie(3, "Фильм 3");
    Movie movie4 = new Movie(4, "Фильм 4");
    Movie movie5 = new Movie(5, "Фильм 5");
    Movie movie6 = new Movie(6, "Фильм 6");
    Movie movie7 = new Movie(7, "Фильм 7");

    Movie[] collection = {movie1, movie2, movie3, movie4,
            movie5, movie6, movie7};

    @Test
    public void shouldAddAndFindAll() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        Movie[] movies = manager.findAll();
        Assertions.assertEquals(3, movies.length);

        Movie[] expectedMovies = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(movies, expectedMovies);
    }

    @Test
    public void shouldFindLast() {
        for (Movie movie : collection) {
            manager.add(movie);
        }

        Movie[] movies = manager.findLast();
        Assertions.assertEquals(5, movies.length);

        Movie[] expectedMovies = {movie7, movie6, movie5, movie4, movie3};
        Assertions.assertArrayEquals(movies, expectedMovies);
    }

    @Test
    public void shouldFindLastCustom() {
        MovieManager manager = new MovieManager(2);
        for (Movie movie : collection) {
            manager.add(movie);
        }

        Movie[] movies = manager.findLast();
        Assertions.assertEquals(2, movies.length);

        Movie[] expectedMovies = {movie7, movie6};
        Assertions.assertArrayEquals(movies, expectedMovies);
    }

    @Test
    public void shouldContainNoMoviesAfterCreation() {
        MovieManager manager = new MovieManager();
        Movie[] movies = manager.findAll();
        Assertions.assertEquals(0, movies.length);
    }
}