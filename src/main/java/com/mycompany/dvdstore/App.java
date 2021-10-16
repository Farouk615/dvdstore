package com.mycompany.dvdstore;

import com.mycompany.dvdstore.MovieService.Service;
import com.mycompany.dvdstore.entity.Movie;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("donner le title");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println("donner le genre");
        String genre = sc.nextLine();
        Movie movie = new Movie();
        movie.setGenre(genre);
        movie.setTitle(title);
        Service ser = new Service();
        ser.registerMovie(movie);

    }
}
