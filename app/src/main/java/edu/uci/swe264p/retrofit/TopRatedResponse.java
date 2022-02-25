package edu.uci.swe264p.retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TopRatedResponse {
    @SerializedName("results")
    private List<Movie> movies;
    public TopRatedResponse(List<Movie> movies){
        this.movies = movies;
    }
    public List<Movie> getTopMovies(){
        return this.movies;
    }
}
