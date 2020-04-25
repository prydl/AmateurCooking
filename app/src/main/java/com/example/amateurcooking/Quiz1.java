package com.example.amateurcooking;

//TO-DO: fill all questions for Quiz 1
public class Quiz1  {

    public String mQuestions[] = {
            "Which of these is not an ingredient of the cheese omelette? ",
            "How do you beat the eggs in the first step of the omelette recipe?",
            "What do you add immediately after the eggs have been beaten for the cheese omelette?",
            "Which of these is used as a garnish at the very end for bruschetta?",
            "What is a good colour sign that the sourdough bread is toasted?",
            "What combination of three ingredients form the main topping for bruschetta ",
            "How long do you simmer the quinoa for the chicken salad?",
            "What do you need to ensure is in the pan before cooking the chicken for the chicken salad?",
            "How much lime juice should be added in the chicken salad?",
            "Which of these is an ingredient for garlic roast potatoes?",
            "What portions should the potatoes be cut for the garlic roast potatoes?",
            "How long should you bake the potatoes for garlic roast potatoes?"

    };

    private String mChoices[][] = {
            {"Eggs", "Milk", "Butter", "Flour"},
            {"Slow speed", "Fast speed", "Medium speed", "You don't beat them"},
            {"Tomato", "Cheese", "Milk", "Salt and Pepper"},
            {"Onion", "Garlic powder", "Olive oil", "Parsley"},
            {"Black", "Looks the same", "Dark brown", "Golden brown"},
            {"Tomato, onion & parsley", "Tomato, onion & ginger", "Onion, ginger & garlic", "Onion, chilli & tomato "},
            {"30 mins", "20 mins", "10 mins", "5 mins"},
            {"Quinoa", "Avocado", "Olive oil", "Onions"},
            {"4 tbsp", "1 tbsp", "3 tbsp", "2 tbsp"},
            {"Minced garlic", "Coriander", "Garlic sauce", "Tomatoes"},
            {"Halves", "Quarters", "Thirds", "Whole"},
            {"15 mins", "30 mins", "45 mins", "60 mins"}
    };

    private String mAnswer[] = {"Flour", "Slow speed", "Milk", "Garlic powder", "Golden brown", "Tomato, onion & parsley", "10 mins", "Olive oil", "2 tbsp", "Minced garlic", "Quarters", "45 mins"};

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
