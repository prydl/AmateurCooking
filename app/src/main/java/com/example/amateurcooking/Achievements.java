package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Achievements extends AppCompatActivity {

    RecyclerView AchievementsRecyclerView;
    AchievementsAdapter achievementsAdapter;
    List<AchievementsItem> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);

        //initialise view
        AchievementsRecyclerView = findViewById(R.id.achievementsrv);
        mData = new ArrayList<>();

        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "24/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("HIGH TEMP!", "Achievement unlocked for making 3 baking recipes!", "22/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("@markhill says:", "John, did you try the garlic potatoes recipe?", "21/04/2020", R.drawable.profile1));
        mData.add(new AchievementsItem("Your recipe was favourited by @markhill", "Amazing work!", "20/04/2020", R.drawable.star));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));
        mData.add(new AchievementsItem("Tenner!", "Congratulations! You've opened 10 Recipes.", "21/04/2020", R.drawable.achievement));


        //initialise adapter
        achievementsAdapter = new AchievementsAdapter(this, mData);
        AchievementsRecyclerView.setAdapter(achievementsAdapter);
        AchievementsRecyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
