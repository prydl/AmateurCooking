package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.amateurcooking.Recipes.Recipe9;
import com.example.amateurcooking.Recipes.Recipe10;
import com.example.amateurcooking.Recipes.Recipe11;
import com.example.amateurcooking.Recipes.Recipe12;

public class level3 extends AppCompatActivity implements View.OnClickListener {

    //declare the cards
    private Button quizButton;
    private ImageButton backbtn;
    private CardView pepperonipizza, pestopasta, beefstirfry, vanillacake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);

        ///setting views references for each card view object
        pepperonipizza = findViewById(R.id.pepperonipizza);
        pestopasta = findViewById(R.id.pestopasta);
        beefstirfry = findViewById(R.id.beefstirfry);
        vanillacake = findViewById(R.id.vanillacake);
        backbtn = findViewById(R.id.backbtn);
        quizButton = findViewById(R.id.quizButton);

        //adding onClickListeners
        pepperonipizza.setOnClickListener(this);
        pestopasta.setOnClickListener(this);
        beefstirfry.setOnClickListener(this);
        vanillacake.setOnClickListener(this);
        backbtn.setOnClickListener(this);
        quizButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        //switch statements to navigate each card to its own page
        switch (v.getId()) {
            case R.id.fishtacos: i = new Intent (this, Recipe9.class); startActivity(i);
                break;

            case R.id.overnightoats: i = new Intent (this, Recipe10.class); startActivity(i);
                break;

            case R.id.chocchipcookies: i = new Intent (this, Recipe11.class); startActivity(i);
                break;

            case R.id.vegetablesoup: i = new Intent (this, Recipe12.class); startActivity(i);
                break;

            case R.id.backbtn: i = new Intent (this, Dashboard.class); startActivity(i);
                break;

            case R.id.quizButton: i = new Intent (this, QuizModel3.class); startActivity(i);
                break;

            //default case break
            default: break;


        }




    }

}
