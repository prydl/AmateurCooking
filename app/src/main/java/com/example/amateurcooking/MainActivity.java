package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;

//add import statements for widgets and views
import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    //initialise fields
    private EditText emailfield;
    private EditText passwordfield;
    private Button signinbutton;
    private TextView test;
    private int counter = 3;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailfield = findViewById(R.id.emailfield);
        passwordfield = findViewById(R.id.passwordfield);
        test = findViewById(R.id.test);
        signinbutton = findViewById(R.id.signinbutton);

        test.setText("Number of attempts remaining: 3");


        signinbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Validate(emailfield.getText().toString(), passwordfield.getText().toString());
                //feedbackText.setText("Incorrect Password");
            }
        });

    }

    // writing a method to validate username and password
    @SuppressLint("SetTextI18n")
    private void Validate(String userEmail, String userPassword) {
        if ((userEmail.equals("johnsmith@gmail.com") && (userPassword.equals("password123")))){
            Intent intent = new Intent(MainActivity.this, Dashboard.class);
            startActivity(intent);
        }else{
            counter--;

            test.setText("Number of attempts remaining: " + toString().valueOf(counter));

            if(counter == 0){
                 signinbutton.setEnabled(false);
            }

        }
    }


}













