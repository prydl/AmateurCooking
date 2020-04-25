package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

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


            //default case break
            default: break;


        }




    }























//        //setting views references for each card view object
//        quizButton = findViewById(R.id.quizButton);
//        backbtn = findViewById(R.id.backbtn);
//        Stat1 = findViewById(R.id.bruschetta);
//
//        //adding onClickListeners
//        quizButton.setOnClickListener(this);
//        Stat1.setOnClickListener(this);
//
//        backbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(level1.this, Dashboard.class);
//                level1.this.startActivity ( intent );
//
//            }
//
//
//        });
//
//
//        }
//
//
//    @Override
//    public void onClick(View v) {
//        Intent intent = new Intent(this, QuizModel1.class);
//        this.startActivity ( intent );
//
//    }



}

