package com.example.amateurcooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.amateurcooking.Recipes.Recipe5;
import com.example.amateurcooking.Recipes.Recipe6;
import com.example.amateurcooking.Recipes.Recipe7;
import com.example.amateurcooking.Recipes.Recipe8;

public class level2 extends AppCompatActivity implements View.OnClickListener {

    //declare the cards
    private Button quizButton;
    private ImageButton backbtn;
    private CardView fishtacos, overnightoats, chocchipcookies, vegetablesoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        //setting views references for each card view object
        fishtacos = findViewById(R.id.fishtacos);
        overnightoats = findViewById(R.id.overnightoats);
        chocchipcookies = findViewById(R.id.chocchipcookies);
        vegetablesoup = findViewById(R.id.vegetablesoup);
        backbtn = findViewById(R.id.backbtn);
        quizButton = findViewById(R.id.quizButton);

        //adding onClickListeners
        fishtacos.setOnClickListener(this);
        overnightoats.setOnClickListener(this);
        chocchipcookies.setOnClickListener(this);
        vegetablesoup.setOnClickListener(this);
        backbtn.setOnClickListener(this);
        quizButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        //switch statements to navigate each card to its own page
        switch (v.getId()) {
            case R.id.fishtacos: i = new Intent (this, Recipe5.class); startActivity(i);
                break;

            case R.id.overnightoats: i = new Intent (this, Recipe6.class); startActivity(i);
                break;

            case R.id.chocchipcookies: i = new Intent (this, Recipe7.class); startActivity(i);
                break;

            case R.id.vegetablesoup: i = new Intent (this, Recipe8.class); startActivity(i);
                break;

            case R.id.backbtn: i = new Intent (this, Dashboard.class); startActivity(i);
                break;

            case R.id.quizButton: i = new Intent (this, QuizModel2.class); startActivity(i);
                break;

            //default case break
            default: break;


        }




    }

}
