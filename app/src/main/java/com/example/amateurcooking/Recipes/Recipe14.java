package com.example.amateurcooking.Recipes;

//imports
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.amateurcooking.R;
import com.example.amateurcooking.level1;
import com.example.amateurcooking.level4;

public class Recipe14 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton backbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe14);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(this);


    }


    public void onClick(View v) {
        Intent intent = new Intent(this, level4.class);
        this.startActivity ( intent );

    }

}