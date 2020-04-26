// Level 3
// Displays overview of recipes for level 3
// INFS3634 2020 T1 - Group 13
// 26-04-2020


package com.example.amateurcooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.amateurcooking.Recipes.Recipe9;
import com.example.amateurcooking.Recipes.Recipe10;
import com.example.amateurcooking.Recipes.Recipe11;
import com.example.amateurcooking.Recipes.Recipe12;

public class level3 extends AppCompatActivity implements View.OnClickListener {

    // initialise variables for layout elements
    private Button quizButton;
    private ImageButton backbtn;
    private CardView pepperonipizza, pestopasta, beefstirfry, vanillacake;


    // set content view and add onclick listeners
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

    // navigate each card to its own page on click
    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.pepperonipizza: i = new Intent (this, Recipe9.class); startActivity(i);
                break;

            case R.id.pestopasta: i = new Intent (this, Recipe10.class); startActivity(i);
                break;

            case R.id.beefstirfry: i = new Intent (this, Recipe11.class); startActivity(i);
                break;

            case R.id.vanillacake: i = new Intent (this, Recipe12.class); startActivity(i);
                break;

            case R.id.backbtn: i = new Intent (this, Dashboard.class); startActivity(i);
                break;

            case R.id.quizButton: i = new Intent (this, QuizModel3.class); startActivity(i);
                break;

            // default case break
            default: break;

        }
    }

}
