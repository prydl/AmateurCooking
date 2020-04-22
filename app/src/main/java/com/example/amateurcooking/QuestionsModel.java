package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;

//add imports
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionsModel extends AppCompatActivity {

    //initialise variables
    private TextView question, score;
    private RadioButton option1, option2, option3, option4;
    private Button quitButton, nextButton;
    //private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        //find variables by ID
        question = findViewById(R.id.tvQuestion);
        option1 = findViewById(R.id.optOne);
        option2 = findViewById(R.id.optTwo);
        option3 = findViewById(R.id.optThree);
        option4 = findViewById(R.id.optFour);
        score = findViewById(R.id.qLeft);
        quitButton = findViewById(R.id.quitButton);
        nextButton = findViewById(R.id.nextButton);

        //create actions that occur when the user clicks each button
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}

