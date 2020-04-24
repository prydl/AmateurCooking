package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class Achievements extends AppCompatActivity {

    RecyclerView AchievementsRecyclerView;
    AchievementsAdapter achievementsAdapter;
    List<AchievementsItem> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);
    }
}
