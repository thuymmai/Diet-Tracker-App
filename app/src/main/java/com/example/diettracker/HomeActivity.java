package com.example.diettracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    EditText userInput;
    Button buttonViewFoodItem, buttonViewMeal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        userInput = findViewById(R.id.userInput);
        buttonViewFoodItem = findViewById(R.id.buttonViewFoodItem);
        //buttonViewMeal = findViewById(R.id.buttonViewMeal);

        buttonViewFoodItem.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ViewFoodItem.class);
            startActivity(intent);
        });

        // Placeholder for buttonViewMeal if needed
//        buttonViewMeal.setOnClickListener(v -> {
//            // For now, it could also go to ViewFoodItem or another activity
//            Intent intent = new Intent(HomeActivity.this, ViewMeal.class);
//            startActivity(intent);
//        });

        Button buttonViewMeal = findViewById(R.id.buttonViewMeal);
        buttonViewMeal.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), ViewMeal.class);
            startActivity(intent);
        });
    }
}
