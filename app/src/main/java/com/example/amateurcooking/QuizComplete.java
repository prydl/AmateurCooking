// Quiz Complete
// Shows generic quiz completion screen
// INFS3634 2020 T1 - Group 13
// 26-04-2020


package com.example.amateurcooking;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

//imports for Konfetti
import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Size;
import nl.dionsegijn.konfetti.models.Shape.Circle;
import nl.dionsegijn.konfetti.models.Shape.Square;


public class QuizComplete extends AppCompatActivity implements View.OnClickListener {


    // initialise variables
    private Button doneButton;
    private KonfettiView viewKonfetti;


    // display quiz completion text and animated confetti
    // Konfetti module adapted from Daniel Martinus
    // https://github.com/DanielMartinus/Konfetti
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_complete);


        doneButton = findViewById(R.id.doneButton);
        doneButton.setOnClickListener(this);
        viewKonfetti = findViewById(R.id.viewKonfetti);

        //confetti to build when user reaches Quiz Complete page
        viewKonfetti.build()
                .addColors(Color.RED, Color.GREEN, Color.YELLOW)
                .setDirection(0.0, 359.0)
                .setSpeed(1f, 5f)
                .setFadeOutEnabled(true)
                .setTimeToLive(2000L)
                .addShapes(Square.INSTANCE, Circle.INSTANCE)
                .addSizes(new Size(12, 5))
                .setPosition(-50f, viewKonfetti.getWidth() + 50f, -50f, -50f)
                .streamFor(300, 5000L);

    }


    // set page to Dashboard once quiz is completed
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Dashboard.class);
            this.startActivity ( intent );
    }


}


