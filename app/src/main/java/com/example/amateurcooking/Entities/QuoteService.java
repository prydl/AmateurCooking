package com.example.amateurcooking.Entities;

//add import statements for retrofit
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

//week 8 tutorial: here we define the endpoints
public interface QuoteService {

    //use @GET to retrieve data
    //define which category
    @GET("/jokes/random?category=food")
    Call<QuoteResponse> getQuotes();





}