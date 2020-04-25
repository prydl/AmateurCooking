package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.amateurcooking.Recipes.Recipe13;
import com.example.amateurcooking.Recipes.Recipe14;
import com.example.amateurcooking.Recipes.Recipe15;
import com.example.amateurcooking.Recipes.Recipe16;

public class level4 extends AppCompatActivity implements View.OnClickListener {

    //declare the cards
    private Button quizButton;
    private ImageButton backbtn;
    private CardView redchickencurry,butterchicken, chickendumplings, ricottaenchilada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);

        //setting views references for each card view object
        redchickencurry = findViewById(R.id.redchickencurry);
        butterchicken = findViewById(R.id.butterchicken);
        chickendumplings = findViewById(R.id.chickendumplings);
        ricottaenchilada = findViewById(R.id.ricottaenchilada);
        backbtn = findViewById(R.id.backbtn);
        quizButton = findViewById(R.id.quizButton);

        //adding onClickListeners
        redchickencurry.setOnClickListener(this);
        butterchicken.setOnClickListener(this);
        chickendumplings.setOnClickListener(this);
        ricottaenchilada.setOnClickListener(this);
        backbtn.setOnClickListener(this);
        quizButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        //switch statements to navigate each card to its own page
        switch (v.getId()) {
            case R.id.bruschetta: i = new Intent (this, Recipe13.class); startActivity(i);
                break;

            case R.id.chickensalad: i = new Intent (this, Recipe14.class); startActivity(i);
                break;

            case R.id.omelette: i = new Intent (this, Recipe15.class); startActivity(i);
                break;

            case R.id.garlicpotatoes: i = new Intent (this, Recipe16.class); startActivity(i);
                break;

            case R.id.backbtn: i = new Intent (this, Dashboard.class); startActivity(i);
                break;

            case R.id.quizButton: i = new Intent (this, QuizModel4.class); startActivity(i);
                break;

            //default case break
            default: break;


        }




    }

}