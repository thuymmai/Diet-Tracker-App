package com.example.diettracker;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }

    EditText simpleEditText = (EditText) findViewById(R.id.userInput);

    String strValue = simpleEditText.getText().toString();

    //convert it to integer type for calculations
    int number = Integer.parseInt(strValue);
}