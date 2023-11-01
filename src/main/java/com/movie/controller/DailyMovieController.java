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
    @ResponseBody // 자바객체를 HTTP요청의 바디내용으로 매핑하여 클라이언트로 전송한다.
    public  String movie(@RequestParam("date") String date){
        String result = movieService.topTenMovie(date);
        return result;
    }
}
