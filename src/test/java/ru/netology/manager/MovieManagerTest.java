package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

    @Test
    public void shouldOutput10LastAddMoviesFromAllList() {
        MovieManager manager = new MovieManager();
        Movie movie1 = new Movie(1, "https://1", "Bloodshot", "Action movie");
        Movie movie2 = new Movie(2, "https://2", "Вперёд", "cartoon");
        Movie movie3 = new Movie(3, "https://2", "Отель Белград", "comedy");
        Movie movie4 = new Movie(4, "https://4", "Gentlemen", "Action movie");
        Movie movie5 = new Movie(5, "https://5", "The Invisible Man", "horror stories");
        Movie movie6 = new Movie(6, "https://6", "Trolls World Tour", "cartoon");
        Movie movie7 = new Movie(7, "https://7", "Номер один", "comedy");
        Movie movie8 = new Movie(8, "https://8", "Стрельцов", "biography");
        Movie movie9 = new Movie(9, "https://9", "The Lion King", "cartoon");
        Movie movie10 = new Movie(10, "https://10", "Mirrors", "horror stories");
        Movie movie11 = new Movie(11, "https://11", "Saw", "horror stories");
        Movie movie12 = new Movie(12, "https://12", "Wrong turn Foundation", "horror stories");

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputLastAddMoviesFromAllListIfTheirLess10() {
        MovieManager manager = new MovieManager(5);
        Movie movie1 = new Movie(1, "https://1", "Bloodshot", "Action movie");
        Movie movie2 = new Movie(2, "https://2", "Вперёд", "cartoon");
        Movie movie3 = new Movie(3, "https://2", "Отель Белград", "comedy");
        Movie movie4 = new Movie(4, "https://4", "Gentlemen", "Action movie");
        Movie movie5 = new Movie(5, "https://5", "The Invisible Man", "horror stories");

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldOutput10Movies() {
        MovieManager manager = new MovieManager();
        Movie movie1 = new Movie(1, "https://1", "Bloodshot", "Action movie");
        Movie movie2 = new Movie(2, "https://2", "Вперёд", "cartoon");
        Movie movie3 = new Movie(3, "https://2", "Отель Белград", "comedy");
        Movie movie4 = new Movie(4, "https://4", "Gentlemen", "Action movie");
        Movie movie5 = new Movie(5, "https://5", "The Invisible Man", "horror stories");
        Movie movie6 = new Movie(6, "https://6", "Trolls World Tour", "cartoon");
        Movie movie7 = new Movie(7, "https://7", "Номер один", "comedy");
        Movie movie8 = new Movie(8, "https://8", "Стрельцов", "biography");
        Movie movie9 = new Movie(9, "https://9", "The Lion King", "cartoon");
        Movie movie10 = new Movie(10, "https://10", "Mirrors", "horror stories");

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expected, actual);

    }

}


