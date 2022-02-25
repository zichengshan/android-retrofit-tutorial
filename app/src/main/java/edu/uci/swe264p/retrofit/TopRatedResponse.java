package edu.uci.swe264p.retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TopRatedResponse {
    @SerializedName("results")
    private List<Movie> movies;

    public TopRatedResponse(List<Movie> movies){
        this.movies = movies;
    }
    public List<Movie> getTop20Movies(){
        // we only need the top 20 movies
        if(movies.size() > 20) {
            return movies.subList(0,20);
        }
        return this.movies;
    }
}
