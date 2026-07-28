package com.example.diettracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button goToViewMeal = findViewById(R.id.buttonViewMeal);

        goToViewMeal.setOnClickListener(view -> {
           Intent intent = new Intent(getApplicationContext(), ViewFoodItem.class);
           startActivity(intent);
        });
    }
}