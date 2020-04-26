// ChuckNorrisFood
// Displays Chuck Norris food jokes
// INFS3634 2020 T1 - Group 13
// 26-04-2020

// Implemented using the Chuck Norris Jokes API
// https://api.chucknorris.io/jokes/


package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

// add retrofit imports
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// import the java classes from Entities
import com.example.amateurcooking.Entities.QuoteResponse;
import com.example.amateurcooking.Entities.QuoteService;



public class ChuckNorrisFood extends AppCompatActivity implements View.OnClickListener {

    // initialise variables for layout elements
    TextView quoteBox;
    Button getButton;
    private ImageButton backbtn;


    // get layout elements and set onclick listeners
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuck_norris_food);

        // instantiating
        quoteBox = findViewById(R.id.quoteBox);
        getButton = findViewById(R.id.getButton);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(this);

        getButton.setOnClickListener(v -> {
            // set a text in between quotes to avoid blank space
            quoteBox.setText("Getting a foodie quote...");
            setQuote();
        });

        setQuote();

    }


    // get quote from API using Retrofit
    // set hardcoded text
    public void setQuote(){
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://api.chucknorris.io/jokes/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        QuoteService service = retrofit.create(QuoteService.class);
        Call<QuoteResponse> call = service.getQuotes();

        // adapted from Tutorial 8 code
        call.enqueue(new Callback<QuoteResponse>() {
            @Override
            public void onResponse(Call<QuoteResponse> call, Response<QuoteResponse> response) {
                QuoteResponse quote = response.body();
                quoteBox.setText(quote.getValue());
            }

            @Override
            public void onFailure(Call<QuoteResponse> call, Throwable t) {
                //setting message in case of failure
                String msg = "Error occurred. Please try again.";

                Toast.makeText(ChuckNorrisFood.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }


    // return to dashboard onclick
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Dashboard.class);
        this.startActivity ( intent );
    }
}

