package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;

//add imports
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;


import java.util.Random;

public class QuestionsModel extends AppCompatActivity {

    //initialise variables
    private TextView question, score;
    private RadioButton option1, option2, option3, option4;
    private Button quitButton, nextButton;
    //private int count = 0;

    //calling questions
    private QuestionsModel mQuestions = new QuestionsModel();
    private String mAnswer;
    private int mScore;
    private int mQuestionsLength = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        r = new Random();

        //find variables by ID
        question = findViewById(R.id.tvQuestion);
        option1 = findViewById(R.id.optOne);
        option2 = findViewById(R.id.optTwo);
        option3 = findViewById(R.id.optThree);
        option4 = findViewById(R.id.optFour);
        score = findViewById(R.id.qLeft);
        quitButton = findViewById(R.id.quitButton);
        nextButton = findViewById(R.id.nextButton);

        //updating
        updateQuestion(r.nextInt(mQuestionsLength));

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

    private void updateQuestion (int num) {
        question.setText(mQuestions.getQuestion(num));
        option1.setText(mQuestions.getAChoice1(num));
        option2.setText(mQuestions.getChoice2(num));
        option3.setText(mQuestions.getChoice3(num));
        option4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getAnswer(num);



}





