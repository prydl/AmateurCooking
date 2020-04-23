package com.example.amateurcooking;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizComplete extends AppCompatActivity implements View.OnClickListener {


    //initialise variables
    private TextView completed, score;
    private Button quitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_model);
    }

    @Override
    public void onClick(View v) {

    }
}


