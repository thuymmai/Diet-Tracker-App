package com.example.diettracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    EditText userInput;
    Button buttonViewFoodItem, buttonViewMeal;
    Button btnBack;
    Button btnQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        userInput = findViewById(R.id.userInput);
        buttonViewFoodItem = findViewById(R.id.buttonViewFoodItem);
        buttonViewMeal = findViewById(R.id.buttonViewMeal);
        btnBack = findViewById(R.id.btnBack);
        btnQuit = findViewById(R.id.btnQuit);

        buttonViewFoodItem.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ViewCategory.class);
            startActivity(intent);
        });

        buttonViewMeal.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ViewMeal.class);
            startActivity(intent);
        });

        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, Register.class);
            startActivity(intent);
        });

        btnQuit.setOnClickListener(v -> {
            finishAffinity();  // close app
        });
    }
}
