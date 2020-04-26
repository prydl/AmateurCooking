// QuoteService
// Obtains quotes from the Chuck Norris API
// INFS3634 2020 T1 - Group 13
// 26-04-2020


package com.example.amateurcooking.Entities;

// import retrofit modules
import retrofit2.Call;
import retrofit2.http.GET;


public interface QuoteService {

    // use @GET to retrieve data
    // must define category to select from CN API
    @GET("/jokes/random?category=food")
    Call<QuoteResponse> getQuotes();

}