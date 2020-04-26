package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizModel2 extends AppCompatActivity implements View.OnClickListener  {

    //initialise variables
    private TextView question, score;
    private Button option1, option2, option3, option4;
    private Button quitButton;


    //calling questions
    private Quiz2 mQuestions = new Quiz2();
    private String mAnswer;
    private int mScore = 0;
    private int counter = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_model);


        //find variables by ID
        question = findViewById(R.id.congratulations);
        option1 = findViewById(R.id.optOne);
        option2 = findViewById(R.id.optTwo);
        option3 = findViewById(R.id.optThree);
        option4 = findViewById(R.id.optFour);
        score = findViewById(R.id.score);
        quitButton = findViewById(R.id.doneButton);

        quitButton.setOnClickListener(this);
        score.setText("Score: " + mScore);

        updateQuestion(counter);

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (option1.getText() == mAnswer) {
                    mScore ++;
                    score.setText("Score: " + mScore);
                    counter++;
                    if (counter < mQuestionsLength) {
                        updateQuestion(counter);
                    } else {
                        completeQuiz();
                    }

                } else {
                    gameOver();

                }

            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (option2.getText() == mAnswer) {
                    mScore ++;
                    score.setText("Score: " + mScore);
                    counter++;
                    if (counter < mQuestionsLength) {
                        updateQuestion(counter);
                    } else {
                        completeQuiz();
                    }
                } else {
                    gameOver();

                }

            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (option3.getText() == mAnswer) {
                    mScore ++;
                    score.setText("Score: " + mScore);
                    counter++;
                    if (counter < mQuestionsLength) {
                        updateQuestion(counter);
                    } else {
                        completeQuiz();
                    }
                } else {
                    gameOver();

                }

            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (option4.getText() == mAnswer) {
                    mScore ++;
                    score.setText("Score: " + mScore);
                    counter++;
                    if (counter < mQuestionsLength) {
                        updateQuestion(counter);
                    } else {
                        completeQuiz();
                    }
                } else {
                    gameOver();

                }

            }
        });

    }

    private void updateQuestion (int num) {
        question.setText(mQuestions.getQuestion(num));
        option1.setText(mQuestions.getChoice1(num));
        option2.setText(mQuestions.getChoice2(num));
        option3.setText(mQuestions.getChoice3(num));
        option4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getAnswer(num);
    }

    private void completeQuiz () {
        Intent intent = new Intent(this, QuizComplete.class);
        this.startActivity(intent);
    }

    private void gameOver () {

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("Incorrect, game over!");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();

        Intent intent = new Intent(this, level1.class);
        this.startActivity ( intent );

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, level2.class);
        this.startActivity ( intent );

    }




}




