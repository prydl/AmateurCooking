// Quiz 4
// Stores bank of questions, choices and answers for quiz 4
// INFS3634 2020 T1 - Group 13
// 26-04-2020


package com.example.amateurcooking;

public class Quiz4 {

    public String mQuestions[] = {
            "How many grams of chicken was used in the red curry recipe?",
            "How are the chicken dumplings cooked?",
            "How much corn is used in the enchilada recipe?",
            "What sauce are the chicken dumplings served with?",
            "What essential seasoning is to make the butter chicken?",
            "How long is the red thai curry boiled for before serving?",
            "Which of the following ingredients is not used to garnish the enchilada?",
            "How much butter needs to go into the butter chicken?",
            "How many table spoons of red curry paste are added?",
            "What ingredient(s) are added just before serving the butter chicken?",
            "How long are the dumplings steamed for?",
            "Which of the following is added after the onion, spinach & corn is added in the enchilada recipe?"

    };

    private String mChoices[][] = {
            {"150g", "200g", "230g", "250g"},
            {"Steamed", "Boiled", "Pan-Fried", "Boiled & Pan-Fried"},
            {"1/4 cup", "1/2 cup", "3/4 cup", "1 cup"},
            {"Soy Sauce", "Chilli Oil", "Dumpling Sauce", "Chilli Sauce"},
            {"Pepper and Salt", "Garam Masala", "Chilli Flakes", "Saffron"},
            {"2 mins", "5 mins", "10 mins", "15 mins"},
            {"Sour Cream", "Chilli", "Coriander", "Guacamole"},
            {"10g", "15g", "20g", "25g"},
            {"3-4 tbsp", "5 tbsp", "5-6 tbsp", "6 tbsp"},
            {"Cream & Coriander", "Coriander", "Salt & Pepper", "Garam Masala"},
            {"5 mins", "6 mins", "8 mins", "10 mins"},
            {"Chilli's", "Enchilada Seasoning", "Ricotta & Mozzarella", "Coriander"}
    };

    private String mAnswer[] = {"200g", "Steamed", "1/2 cup", "Dumpling Sauce", "Garam Masala", "10 mins", "Guacamole", "25g", "5-6 tbsp", "Cream & Coriander", "6 mins", "Enchilada Seasoning"};

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