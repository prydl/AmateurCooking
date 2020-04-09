package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {
    //declare the cards
    private CardView Level1, Level2, Level3, Level4, Level5, Notes;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //setting views references for each card view object
        Level1 = (CardView) findViewById(R.id.card1);
        Level2 = (CardView) findViewById(R.id.card2);
        Level3 = (CardView) findViewById(R.id.card3);
        Level4 = (CardView) findViewById(R.id.card4);
        Level5 = (CardView) findViewById(R.id.card5);
        Notes = (CardView) findViewById(R.id.card6);

        //adding onClickListeners
        Level1.setOnClickListener(this);
        Level2.setOnClickListener(this);
        Level3.setOnClickListener(this);
        Level4.setOnClickListener(this);
        Level5.setOnClickListener(this);
        Notes.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        //switch statements to navigate each card to its own page
        switch (v.getId()) {
            case R.id.card1: i = new Intent (this, level1.class); startActivity(i);
            break;

            case R.id.card2: i = new Intent (this, level2.class); startActivity(i);
                break;

            case R.id.card3: i = new Intent (this, level3.class); startActivity(i);
                break;

            case R.id.card4: i = new Intent (this, level4.class); startActivity(i);
                break;

            case R.id.card5: i = new Intent (this, level5.class); startActivity(i);
                break;

            case R.id.card6: i = new Intent (this, Notes.class); startActivity(i);
                break;

                //default case break
            default: break;


        }




    }
}
