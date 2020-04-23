package com.example.amateurcooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class QuizComplete extends AppCompatActivity implements View.OnClickListener {


    //initialise variables
    private Button doneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_complete);

        doneButton = findViewById(R.id.doneButton);

        doneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Dashboard.class);
            this.startActivity ( intent );
    }
}


