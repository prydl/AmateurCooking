// Notes
// Stores and displays user created notes
// INFS3634 2020 T1 - Group 13
// 26-04-2020


package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Notes extends AppCompatActivity {

    // get content view from layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
    }
}
