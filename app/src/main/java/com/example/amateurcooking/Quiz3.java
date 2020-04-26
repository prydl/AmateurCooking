// Quiz 3
// Stores bank of questions, choices and answers for quiz 3
// INFS3634 2020 T1 - Group 13
// 26-04-2020


package com.example.amateurcooking;

public class Quiz3 {

    public String mQuestions[] = {
            "What oil is used to cook the beef stir fry",
            "How many degrees do you preheat the oven for when baking the vanilla cake?",
            "Which of the following ingredients are not included in the vanilla cake recipe",
            "What is added last to the wok when cooking beef stir fry?",
            "How many grams of Barilla pesto paste is added to the pasta?",
            "What is pesto pasta garnished with in the end?",
            "How long do you cook the pepperoni pizza for?",
            "How many grams of beef is included in the recipe",
            "What is added to the water when cooking the pasta",
            "What cheese is added to the pepperoni pizza?",
            "Which of the following ingredients are not included in the beef stir fry recipe?",
            "What garish is sprinkled on top of the pizza's once cooked"

    };

    private String mChoices[][] = {
            {"Mustard Oil", "Olive Oil", "Peanut Oil", "Vegetable Oil"},
            {"160C", "180C", "200C", "210C"},
            {"Baking Powder", "Eggs", "Milk", "Caster Sugar"},
            {"Beef", "Water", "Vegetables", "Soy Sauce"},
            {"160g", "170g", "180g", "190g"},
            {"Spinach", "Parmesan Cheese", "Salt and Pepper", "Basil"},
            {"10-15 mins", "15-20 mins", "20-25 mins", "25-30 mins"},
            {"300g", "400g", "500g", "600g"},
            {"Salt", "Pepper", "Oil", "None of the above"},
            {"Parmesan Cheese", "Mozzarella Cheese", "Cheddar Cheese", "Ricotta Cheese"},
            {"Soy Sauce", "Garlic", "Ginger", "Oyster Sauce"},
            {"Pepper and Salt", "Mozzarella Cheese", "Oregano", "Italian Herbs"}
    };

    private String mAnswer[] = {"Peanut Oil", "180C", "Caster Sugar", "Beef", "190g", "Parmesan Cheese", "15-20 mins", "500g", "Salt", "Mozzarella Cheese", "Ginger", "Oregano"};

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