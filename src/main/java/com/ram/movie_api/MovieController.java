package com.ram.movie_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/")
    public List<Movie> getAllMovies(){
      return  movieRepository.getAllMovies();
    }

    @GetMapping("/{id}")
    public Optional<Movie> getMovie(@PathVariable long id){
        Optional<Movie> movie = movieRepository.movieList.stream().filter(a -> a.getId() == id).findFirst();
        return movie;
    }

    @PostMapping("/")
    public void addMovie(@RequestBody Movie movie){
        movieRepository.addMovie(movie);
    }
}
