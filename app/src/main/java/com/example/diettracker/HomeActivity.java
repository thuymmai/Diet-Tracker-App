package com.example.diettracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {


    EditText userInput;

    Button buttonViewFoodItem;
    Button buttonViewMeal;

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




        // Go to Nutrition Categories
        buttonViewFoodItem.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            HomeActivity.this,
                            ViewCategory.class
                    );

            startActivity(intent);

        });




        // Go to View Meal
        buttonViewMeal.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            HomeActivity.this,
                            ViewMeal.class
                    );

            startActivity(intent);

        });




        // Back button
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, WelcomeActivity.class);
            startActivity(intent);
            finish();

        });




        // Quit button
        btnQuit.setOnClickListener(v -> {

            finishAffinity();

        });


    }

}