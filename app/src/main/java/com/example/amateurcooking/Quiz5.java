package com.example.amateurcooking;

//TO-DO: fill all questions for Quiz 5
public class Quiz5 {

    public String mQuestions[] = {
            "How much vegetable stock is added to the mushroom risotto?",
            "How long does the beef lasagne bake in the oven for (without the foil)?",
            "Two cups of what flour is used in the apple pie recipe?",
            "How much beef is used in the beef lasagne recipe?",
            "How many hours do you let the dosa batter sit for?",
            "What stock is used in the mushroom risotto?",
            "What do you season the potato with for the masala dosa?",
            "What do you add to the pan after the butter and sugar have been heated for the apple pie?",
            "How many apples are used in the apple pie recipe?",
            "What is placed first in the dish when layering the beef lasagne?",
            "How long do you let the sauce for the beef lasagne thicken for?",
            "What do you add to the heated oil in the saucepan when cooking the mushroom risotto?"

    };

    private String mChoices[][] = {
            {"500mL", "1L", "1.2L", "1.5L"},
            {"15 mins", "20 mins", "25 mins", "30 mins"},
            {"Plain Flour", "Self-Raising Flour", "Plain & Self-Raising Flour", "None of the above"},
            {"400g", "500g", "600g", "700g"},
            {"5 hours", "6 hours", "7 hours", "8 hours"},
            {"Beef Stock", "Chicken Stock", "Herbs Stock", "Vegetable Stock"},
            {"Salt & Pepper", "Salt & Cilantro", "Turmeric and Pepper", "Cilantro & Curry Leaves"},
            {"Apples & Spices", "Cinnamon & Spices", "Apples and Cinnamon", "Apples & Cloves"},
            {"5 Apples", "6 Apples", "7 Apples", "8 Apples"},
            {"Beef Mince", "Cream", "Lasagne Sheets", "Cheese"},
            {"30 mins", "35 mins", "40 mins", "50 mins"},
            {"Butter", "Onions", "Mushrooms", "Garlic Cloves"}
    };

    private String mAnswer[] = {"1L", "15 mins", "Plain & Self-Raising Flour", "600g", "8 hours", "Vegetable Stock", "Salt & Cilantro", "Apples & Spices", "8 Apples", "Beef Mince", "40 mins", "Onions"};

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