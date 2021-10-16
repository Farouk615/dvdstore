package com.mycompany.dvdstore.MovieService;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepository;

public class Service {
    private static String title,genre;
    private MovieRepository movieRepo = new MovieRepository();
    public void registerMovie(Movie movie){
        movie.setTitle(title);
        movie.setGenre(genre);
        movieRepo.add(movie);
    }
}
