package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.amateurcooking.Recipes.Recipe17;
import com.example.amateurcooking.Recipes.Recipe18;
import com.example.amateurcooking.Recipes.Recipe19;
import com.example.amateurcooking.Recipes.Recipe20;

public class level5 extends AppCompatActivity implements View.OnClickListener {

    //declare the cards
    private Button quizButton;

    private ImageButton backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);

        //setting views references for each card view object
        quizButton = findViewById(R.id.quizButton);
        backbtn = findViewById(R.id.backbtn);

        //adding onClickListeners
        quizButton.setOnClickListener(this);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(level5.this, Dashboard.class);
                level5.this.startActivity ( intent );
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, QuizModel5.class);
        this.startActivity ( intent );
    }
}
