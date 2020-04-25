package com.example.amateurcooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.amateurcooking.Recipes.Recipe17;
import com.example.amateurcooking.Recipes.Recipe18;
import com.example.amateurcooking.Recipes.Recipe19;
import com.example.amateurcooking.Recipes.Recipe20;

public class level5 extends AppCompatActivity implements View.OnClickListener {

    //declare the cards
    private Button quizButton;
    private ImageButton backbtn;
    private CardView mushroomrisotto,applepie, beeflasagne, masaladosa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);

        //setting views references for each card view object
        mushroomrisotto = findViewById(R.id.mushroomrisotto);
        applepie = findViewById(R.id.applepie);
        beeflasagne = findViewById(R.id.beeflasagne);
        masaladosa = findViewById(R.id.masaladosa);
        backbtn = findViewById(R.id.backbtn);
        quizButton = findViewById(R.id.quizButton);

        //adding onClickListeners
        mushroomrisotto.setOnClickListener(this);
        applepie.setOnClickListener(this);
        beeflasagne.setOnClickListener(this);
        masaladosa.setOnClickListener(this);
        backbtn.setOnClickListener(this);
        quizButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        //switch statements to navigate each card to its own page
        switch (v.getId()) {
            case R.id.mushroomrisotto: i = new Intent (this, Recipe17.class); startActivity(i);
                break;

            case R.id.applepie: i = new Intent (this, Recipe18.class); startActivity(i);
                break;

            case R.id.beeflasagne: i = new Intent (this, Recipe19.class); startActivity(i);
                break;

            case R.id.masaladosa: i = new Intent (this, Recipe20.class); startActivity(i);
                break;

            case R.id.backbtn: i = new Intent (this, Dashboard.class); startActivity(i);
                break;

            case R.id.quizButton: i = new Intent (this, QuizModel5.class); startActivity(i);
                break;

            //default case break
            default: break;


        }




    }

}