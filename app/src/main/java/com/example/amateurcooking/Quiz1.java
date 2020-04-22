package com.example.amateurcooking;

//TO-DO: fill all questions for Quiz 1
public class Quiz1 {

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

    public String getAChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;

    }

    public String getAChoice2(int a) {
        String choice = mChoices[a][0];
        return choice;

    }

    public String getAChoice3(int a) {
        String choice = mChoices[a][0];
        return choice;

    }

    public String getAChoice4(int a) {
        String choice = mChoices[a][0];
        return choice;

    }

    public String getAnswer(int a) {
        String answer = mAnswers[a];
    }

}
