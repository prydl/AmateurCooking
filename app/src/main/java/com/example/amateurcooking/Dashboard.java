// Dashboard
// Displays the dashboard (main app view)
// INFS3634 2020 T1 - Group 13
// 26-04-2020

// Dashboard elements (CardView) adapted from Android Developers
// https://developer.android.com/reference/android/support/v7/widget/CardView#summary
// Tutorial by Aws Rh on Youtube
// https://www.youtube.com/watch?v=d6CfaWW7G5Q&fbclid=IwAR3NunuXviohz-3G2MXht_MxAxhruwccKPAWF7PHETrAw64k-1cBCAsmW5s


package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class Dashboard extends AppCompatActivity implements View.OnClickListener {

    // initialise variables for layout elements
    private CardView Level1, Level2, Level3, Level4, Level5, Notes;
    private ImageView achievement,progress, chuckapi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // setting views references for each card view object
        Level1 = findViewById(R.id.card1);
        Level2 = findViewById(R.id.card2);
        Level3 = findViewById(R.id.card3);
        Level4 = findViewById(R.id.card4);
        Level5 = findViewById(R.id.card5);
        Notes = findViewById(R.id.card6);
        achievement = findViewById(R.id.achievements);
        progress = findViewById(R.id.progress);
        chuckapi = findViewById(R.id.chuckapi);

        // adding onClickListeners
        Level1.setOnClickListener(this);
        Level2.setOnClickListener(this);
        Level3.setOnClickListener(this);
        Level4.setOnClickListener(this);
        Level5.setOnClickListener(this);
        Notes.setOnClickListener(this);
        achievement.setOnClickListener(this);
        progress.setOnClickListener(this);
        chuckapi.setOnClickListener(this);

    }


    // navigate each card to its own page on click
    @Override
    public void onClick(View v) {
        Intent i;

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

            case R.id.achievements: i = new Intent (this, Achievements.class); startActivity(i);
                break;

            case R.id.progress: i = new Intent (this, ProgressPage.class); startActivity(i);
                break;

            case R.id.chuckapi: i = new Intent (this, ChuckNorrisFood.class); startActivity(i);
                break;

            // default case break
            default: break;

        }
    }

}
