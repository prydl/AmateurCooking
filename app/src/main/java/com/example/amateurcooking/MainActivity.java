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
    private TextView test;

    //find views by id
    private void findViews() {
        emailfield = findViewById(R.id.emailfield);
        //setting sample email
        emailfield.setText("johnsmith@gmail.com");

        passwordfield = findViewById(R.id.passwordfield);
        //setting sample password
        passwordfield.setText("password123");

        signinbutton = findViewById(R.id.signinbutton);
        test = findViewById(R.id.test);

        signinbutton.setOnClickListener((OnClickListener) this);
    }

    public MainActivity(TextView test) {
        this.test = test;
    }

    public TextView getTest() {
        return test;
    }

    public void setTest(TextView test) {
        this.test = test;
    }

    //@Override
    //handle the action upon clicking the sign in button
    public void onClick(View v) {
        if (v == signinbutton) {
            // Handle clicks for sign in button
            if (emailfield.getText().toString() == "johnsmith@gmail.com" && passwordfield.getText().toString() == "password123") {
                //do what
                test.setText("Success");
            } else {
                test.setText("Fail");
            }

        } else {
            test.getText();

        }

        //assume login works and moves onto the next page
        //for now, connect the sign in button with the dashboard page





    }

    }








