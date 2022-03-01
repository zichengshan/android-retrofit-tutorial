package edu.uci.swe264p.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieApiService {
    @GET("movie/{id}")
    Call<Movie> getMovie(@Path("id") int id, @Query("api_key") String apiKey);

    // Create an interface for network requests
    // https://api.themoviedb.org/3/movie/top_rated?api_key=YOUR_API_KEY
    @GET("movie/top_rated")
    Call<TopRatedResponse> getTopMovies(@Query("api_key") String apiKey);
}
