package com.ram.movie_api;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieRepository {
    final List<Movie> movieList = Arrays.asList(
            new Movie.Builder().actor("Ram").id(12).year("2010").name("Solay").build(),
            new Movie.Builder().actor("Shyam").id(13).year("2017").name("Kolay").build(),
            new Movie.Builder().actor("Hari").id(14).year("2018").name("Dolay").build(),
            new Movie.Builder().actor("Krishna").id(15).year("2019").name("Holay").build(),
            new Movie.Builder().actor("Gopal").id(16).year("2020").name("Molay").build(),
             new Movie.Builder().actor("Monip").id(17).year("2018").name("Folay").build(),
            new Movie.Builder().actor("Narayan").id(18).year("2018").name("Dollay").build(),
            new Movie.Builder().actor("James").id(19).year("1992").name("Kolly").build(),
            new Movie.Builder().actor("Kristina").id(20).year("1992").name("Tolay").build(),
            new Movie.Builder().actor("Virat").id(21).year("2020").name("Kallay").build()
    );

    public List<Movie> getAllMovies(){
        return this.movieList;
    }

    public void addMovie(Movie movie){
        movieList.add(movie);
    }

}
