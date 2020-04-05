package com.example.amateurcooking;

import androidx.appcompat.app.AppCompatActivity;

//add import statements for widgets and views
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //initialise fields
    private EditText emailfield;
    private EditText passwordfield;
    private Button signinbutton;
    private TextView feedbackText;

    //find views by id
    private void findViews() {
        emailfield = findViewById(R.id.emailfield);
        //setting sample email
        emailfield.setText("johnsmith@gmail.com");

        passwordfield = findViewById(R.id.passwordfield);
        //setting sample password
        passwordfield.setText("password123");

        feedbackText = findViewById(R.id.test);
        feedbackText.setText("Waiting...");
        // this should work easily though i don't understand why
        // going to try and understand this better

        signinbutton = findViewById(R.id.signinbutton);
        signinbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                feedbackText.setText("You clicked the button");
                // tbh, i'm not sure why this isn't working here
                // its just asking for the button to be pressed
                //its being a bitch
                // i agree

            }
        });
    }

    public MainActivity(TextView feedbackText) {
        this.feedbackText = feedbackText;
    }

    public TextView getTest() {
        return feedbackText;
    }

    public void setTest(TextView feedbackText) {
        this.feedbackText = feedbackText;
    }

    /*
    //@Override
    //handle the action upon clicking the sign in button
    public void onClick(View v) {

        if (v == signinbutton) {
            // Handle clicks for sign in button
            if (emailfield.getText().toString().equals("johnsmith@gmail.com") && passwordfield.getText().toString().equals("password123")) {
                //do what
                feedbackText.setText("Success");
            } else {
                feedbackText.setText("Fail");
            }

        } else {
            feedbackText.getText();

        }

        //assume login works and moves onto the next page
        //for now, connect the sign in button with the dashboard page

    }*/

    }








