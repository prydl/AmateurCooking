package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionsActivity1 extends AppCompatActivity {

    //initialise variables
    private TextView question;
    //private RadioButton option1, option2, option3, option4;
    private LinearLayout optionsContainer;
    private Button quitButton, nextButton;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        //find variables by ID
        question = findViewById(R.id.tvQuestion);
        //qLeft = findViewById(R.id.qLeft);
        optionsContainer = findViewById(R.id.questionsContainer);
        quitButton = findViewById(R.id.quitButton);
        nextButton = findViewById(R.id.nextButton);

    }
}

