// Recipe 5
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
import com.example.amateurcooking.level2;

public class Recipe5 extends AppCompatActivity implements View.OnClickListener {

    // initialise variables
    private ImageButton backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe5);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(this);
    }


    // return to current level
    public void onClick(View v) {
        Intent intent = new Intent(this, level2.class);
        this.startActivity ( intent );
    }

}
