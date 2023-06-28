package com.movie.controller;

import com.movie.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller //post body 필요하면 @ResponseBody 쓰자
public class DailyMovieController {

    private final MovieService movieService;

    public DailyMovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movie/topten")
    public String movieTopTen(){
        return "movie-topten";
    }

    @PostMapping("/move")
    @ResponseBody
    public  String movie(@RequestParam("date") String date){
        movieService.topTenMovie(date);
        return movieService.topTenMovie(date);
    }
}
