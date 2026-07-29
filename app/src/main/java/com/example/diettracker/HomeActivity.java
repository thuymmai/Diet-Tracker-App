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
<<<<<<< HEAD
        buttonViewMeal = findViewById(R.id.buttonViewMeal);
        btnBack = findViewById(R.id.btnBack);
        btnQuit = findViewById(R.id.btnQuit);
=======
        //buttonViewMeal = findViewById(R.id.buttonViewMeal);
>>>>>>> e1333cafd9be22cfddb307f3c0af75e17b0f01c8

        buttonViewFoodItem.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ViewCategory.class);
            startActivity(intent);
        });

<<<<<<< HEAD
        buttonViewMeal.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ViewMeal.class);
            startActivity(intent);
        });

        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, Register.class);
=======
        // Placeholder for buttonViewMeal if needed
//        buttonViewMeal.setOnClickListener(v -> {
//            // For now, it could also go to ViewFoodItem or another activity
//            Intent intent = new Intent(HomeActivity.this, ViewMeal.class);
//            startActivity(intent);
//        });

        buttonViewMeal = findViewById(R.id.buttonViewMeal);
        buttonViewMeal.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), ViewMeal.class);
>>>>>>> e1333cafd9be22cfddb307f3c0af75e17b0f01c8
            startActivity(intent);
        });

        btnQuit.setOnClickListener(v -> {
            finishAffinity();  // close app
        });
    }
}
