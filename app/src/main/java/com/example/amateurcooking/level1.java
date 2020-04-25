package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.amateurcooking.Recipes.Recipe1;
import com.example.amateurcooking.Recipes.Recipe2;
import com.example.amateurcooking.Recipes.Recipe3;
import com.example.amateurcooking.Recipes.Recipe4;

public class level1 extends AppCompatActivity implements OnClickListener {
    //declare the cards
    private Button quizButton;
    private ImageButton backbtn;
    private CardView Bruschetta,ChickenSalad, Omelette, GarlicPotatoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        //setting views references for each card view object
        Bruschetta = findViewById(R.id.bruschetta);
        ChickenSalad = findViewById(R.id.chickensalad);
        Omelette = findViewById(R.id.omelette);
        GarlicPotatoes = findViewById(R.id.garlicpotatoes);
        backbtn = findViewById(R.id.backbtn);
        quizButton = findViewById(R.id.quizButton);

        //adding onClickListeners
        Bruschetta.setOnClickListener(this);
        ChickenSalad.setOnClickListener(this);
        Omelette.setOnClickListener(this);
        GarlicPotatoes.setOnClickListener(this);
        backbtn.setOnClickListener(this);
        quizButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        //switch statements to navigate each card to its own page
        switch (v.getId()) {
            case R.id.bruschetta: i = new Intent (this, Recipe1.class); startActivity(i);
                break;

            case R.id.chickensalad: i = new Intent (this, Recipe2.class); startActivity(i);
                break;

            case R.id.omelette: i = new Intent (this, Recipe3.class); startActivity(i);
                break;

            case R.id.garlicpotatoes: i = new Intent (this, Recipe4.class); startActivity(i);
                break;

            case R.id.backbtn: i = new Intent (this, Dashboard.class); startActivity(i);
                break;

            case R.id.quizButton: i = new Intent (this, Quiz1.class); startActivity(i);
                break;

            //default case break
            default: break;


        }




    }

}

