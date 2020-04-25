package com.example.amateurcooking;

//other imports
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//add retrofit imports
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//import the java classes from Entities
import com.example.amateurcooking.Entities.QuoteResponse;
import com.example.amateurcooking.Entities.QuoteService;

public class ChuckNorrisFood extends AppCompatActivity {

    TextView quoteBox;
    Button getButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuck_norris_food);

        //instantiating
        quoteBox = findViewById(R.id.quoteBox);
        getButton = findViewById(R.id.getButton);

        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // set a text in between quotes to avoid blank space
                quoteBox.setText("Getting a foodie quote...");
                setQuote();
            }
        });

        setQuote();

    }

    //setting up Retrofit to get quote from API
    //setting hardcoded text
    public void setQuote(){
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://api.chucknorris.io/jokes/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        QuoteService service = retrofit.create(QuoteService.class);
        Call<QuoteResponse> call = service.getQuotes();

        //code extracted from Tutorial 8
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
}

