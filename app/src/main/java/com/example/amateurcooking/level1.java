package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class level1 extends AppCompatActivity implements OnClickListener {
    //declare the cards
    private Button quizButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        //setting views references for each card view object
        quizButton = findViewById(R.id.quizButton);

        //adding onClickListeners
        quizButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, QuestionsActivity1.class);
        this.startActivity ( intent );



    }
}
