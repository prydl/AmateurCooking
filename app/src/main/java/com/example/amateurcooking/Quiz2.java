package com.example.amateurcooking;

//TO-DO: fill all questions for Quiz 1
public class Quiz2  {

    public String mQuestions[] = {
            "What else needs to be added to the salsa besides, tomatoes, onion and chilli for the fish tacos?",
            "What is the garnish for the fish tacos?",
            "What is the fish drizzled with for fish tacos?",
            "What sweet ingredient is added to the overnight oats?",
            "How long should we refrigerate the overnight oats?",
            "What are the overnight oats served with?",
            "How long should the choc chip cookies be baked for?",
            "What two types of sugars are used for choc chip cookies?",
            "How much mixture should each ball contain for choc chip cookies?",
            "Which vegetable is added prior to others for the vegetable soup?",
            "Which of these is not an ingredient of vegetable soup?",
            "How long should you boil the vegetable soup?"

    };

    private String mChoices[][] = {
            {"Lime juice & pinch of salt", "Olive oil", "Mayonnaise", "Coriander"},
            {"Garlic", "Ginger", "Parsley", "Coriander"},
            {"Olive oil", "Chilli sauce", "Mayonnaise", "Lime juice"},
            {"Sugar", "Chocolate", "Honey", "Cream"},
            {"2 hrs", "30 mins", "4 hrs", "Overnight"},
            {"Tomatoes & Onions", "Bananas & Strawberries", "Grapes & Blueberries", "Raspberries and Blackberries"},
            {"10 mins", "20 mins", "30 mins", "40 mins"},
            {"Brown & caster sugar", "Raw & brown sugar", "Raw & caster sugar", "Brown & white sugar"},
            {"1 tbsp", "2 tbsp", "3 tbsp", "4 tbsp"},
            {"Carrot", "Potato", "Onion", "Celery"},
            {"Italian Seasoning", "Vegetable stock", "Lemon juice", "Chicken"},
            {"15 mins", "25 mins", "35 mins", "45 mins"}
    };

    private String mAnswer[] = {"Lime juice & pinch of salt", "Coriander", "Mayonnaise", "Honey", "Overnight", "Bananas & Strawberries", "20 mins", "Brown & caster sugar", "2 tbsp", "Onion", "Chicken", "35 mins"};

    public String getQuestion (int a) {
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
        String answer = mAnswer[a];
        return answer;
    }

}
