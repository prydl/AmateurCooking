package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);

        //setting views references for each card view object
        quizButton = findViewById(R.id.quizButton);
        backbtn = findViewById(R.id.backbtn);

        //adding onClickListeners
        quizButton.setOnClickListener(this);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(level3.this, Dashboard.class);
                level3.this.startActivity ( intent );
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, QuizModel3.class);
        this.startActivity ( intent );
    }
}
