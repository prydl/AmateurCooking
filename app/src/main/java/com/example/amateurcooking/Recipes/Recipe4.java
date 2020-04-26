// Recipe 4
// Displays the content for recipe
// INFS3634 2020 T1 - Group 13
// 26-04-2020


package com.example.amateurcooking.Recipes;

//imports
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.amateurcooking.R;
import com.example.amateurcooking.level1;

public class Recipe4 extends AppCompatActivity implements View.OnClickListener {

    // initialise variables
    private ImageButton backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe1);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(this);
    }


    // return to current level
    public void onClick(View v) {
        Intent intent = new Intent(this, level1.class);
        this.startActivity ( intent );
    }

}
