package com.example.amateurcooking;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Shape.Circle;
import nl.dionsegijn.konfetti.models.Shape.Square;
import nl.dionsegijn.konfetti.models.Size;


public class QuizComplete extends AppCompatActivity implements View.OnClickListener {


    //initialise variables
    private Button doneButton;
    private KonfettiView viewKonfetti;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_complete);


        doneButton = findViewById(R.id.doneButton);
        viewKonfetti = findViewById(R.id.viewKonfetti);

        doneButton.setOnClickListener(this);

        viewKonfetti.build()
                .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
                .setDirection(0.0, 359.0)
                .setSpeed(1f, 5f)
                .setFadeOutEnabled(true)
                .setTimeToLive(2000L)
                .addShapes(new Square(), new Circle())
                .addSizes(new Size(12, 5))
                .setPosition(-50f, viewKonfetti.getWidth() + 50f, -50f, -50f)
                .streamFor(300, 5000L);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Dashboard.class);
            this.startActivity ( intent );
    }
}


