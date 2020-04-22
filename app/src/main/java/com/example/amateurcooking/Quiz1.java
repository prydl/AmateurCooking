package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;

//TO-DO: fill all questions for Quiz 1
public class Quiz1 extends AppCompatActivity {

    public String mQuestions[] = {
            "What is your name?",
            "What is your age?",
            "What is your sister's name?"
    };

    private String mChoices[][] = {
            {"Bob", "John", "Alien", "Juan"},
            {"12", "45", "20", "5"},
            {"Bell", "Swell", "Smell", "Tell"}
    };

    private String mAnswers[] = {"John", "20", "Bell"};

    public String getQuestions (int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;

    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;

    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;

    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;

    }

    public String getAnswer(int a) {
        String answer = mAnswers[a];
        return answer;
    }

}
