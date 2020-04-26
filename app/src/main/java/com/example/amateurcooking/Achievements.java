// Achievements
// Displays user achievements using RecyclerView
// INFS3634 2020 T1 - Group 13
// 26-04-2020

// Adapted using Jetpack RecyclerView from Android Developers
// https://developer.android.com/guide/topics/ui/layout/recyclerview?hl=en


package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Achievements extends AppCompatActivity {

    // initialise variables
    RecyclerView AchievementsRecyclerView;
    AchievementsAdapter achievementsAdapter;
    List<AchievementsItem> mData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);

        // initialise view
        AchievementsRecyclerView = findViewById(R.id.achievementsrv);
        mData = new ArrayList<>();

        // adding achievements data
        mData.add(new AchievementsItem("Cake Face", "Vanilla Cake? Now you know the basics of every cake!", "24/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("HIGH TEMP!", "Achievement unlocked for making 3 baking recipes!", "22/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("@markhill says:", "John, did you try the garlic potatoes recipe?", "21/04/2020", R.drawable.profile1));
        mData.add(new AchievementsItem("Your recipe was upvoted by @markhill", "Amazing work!", "20/04/2020", R.drawable.star));
        mData.add(new AchievementsItem("Valiant Visitor", "Good work on visiting your friends progresses!", "19/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Pushing Through!", "We know you worked extra hard on that recipe!", "17/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("@laura35 says:", "My pesto ended up bitter...any solutions?", "16/04/2020", R.drawable.profile2));
        mData.add(new AchievementsItem("@haileybailey says:", "John how did you make the base of your Red Chicken Curry?", "15/04/2020", R.drawable.profile3));
        mData.add(new AchievementsItem("Winner winner, chicken dinner!", "You've become a chicken-cooking expert", "14/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Level 3...Now you're free!", "Level 3 Unlocked!", "12/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "10/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("@markhill says:", "I added tofu instead of fish in the tacos..you?", "05/04/2020", R.drawable.profile1));
        mData.add(new AchievementsItem("@haileybailey says:", "I love the recipes in Level 2, and your variations!", "03/04/2020", R.drawable.profile3));
        mData.add(new AchievementsItem("I SEA FOOD, I EAT FOOD", "First seafood recipe successfully completed!", "01/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Variety!", "People loved your variation of Overnight Oats!", "30/03/2020", R.drawable.star));
        mData.add(new AchievementsItem("LEVEL 2 HERE WE GO!", "Looking at you on your way to becoming a chef!", "24/03/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Flaming hot!", "Using the flame for your recipes? That's hot.", "22/03/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Welcome!", "You've opened your first recipe!", "19/03/2020", R.drawable.achievement));


        // add achievements adapter
        achievementsAdapter = new AchievementsAdapter(this, mData);
        AchievementsRecyclerView.setAdapter(achievementsAdapter);
        AchievementsRecyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
