package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {
    Movie movie = new Movie(1, "Фильм 1");

    @Test
    public void shouldGetId() {
        Assertions.assertEquals(1, movie.getId());
    }

    @Test
    public void shouldGetName() {
        Assertions.assertEquals("Фильм 1", movie.getName());
    }

    @Test
    public void shouldSetId() {
        movie.setId(2);
        Assertions.assertEquals(2, movie.getId());
    }

    @Test
    public void shouldSetName() {
        movie.setName("Фильм 10");
        Assertions.assertEquals("Фильм 10", movie.getName());
    }
}
