package com.example.diettracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ViewCategory extends AppCompatActivity {

    EditText etProtein, etRice, etVegetable, etFruit;
    Button btnSave;
    Button btnBack;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_category);

        etProtein = findViewById(R.id.etProtein);
        etRice = findViewById(R.id.etRice);
        etVegetable = findViewById(R.id.etVegetable);
        etFruit = findViewById(R.id.etFruit);

        btnSave = findViewById(R.id.btnSave);
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(ViewCategory.this, HomeActivity.class);
            startActivity(intent);
            finish();
        });
        tvResult = findViewById(R.id.tvResult);

        btnSave.setOnClickListener(v -> {
            String protein = etProtein.getText().toString().trim();
            String rice = etRice.getText().toString().trim();
            String vegetable = etVegetable.getText().toString().trim();
            String fruit = etFruit.getText().toString().trim();

            if (protein.isEmpty()) protein = "0";
            if (rice.isEmpty()) rice = "0";
            if (vegetable.isEmpty()) vegetable = "0";
            if (fruit.isEmpty()) fruit = "0";
            Toast.makeText(ViewCategory.this,
                    "Data saved successfully!",
                    Toast.LENGTH_SHORT).show();
// Convert input to numbers
            int proteinServing = Integer.parseInt(protein);
            int riceCup = Integer.parseInt(rice);
            int vegetableServing = Integer.parseInt(vegetable);
            int fruitServing = Integer.parseInt(fruit);

// Calories
            int proteinCalories = proteinServing * 120;
            int riceCalories = riceCup * 200;
            int vegetableCalories = vegetableServing * 50;
            int fruitCalories = fruitServing * 80;

// Total calories
            int totalCalories = proteinCalories + riceCalories
                    + vegetableCalories + fruitCalories;

            String result =
                    "Today's Nutrition\n\n" +
                            "Protein: " + proteinServing + " servings (" + proteinCalories + " cal)\n" +
                            "Rice: " + riceCup + " cups (" + riceCalories + " cal)\n" +
                            "Vegetables: " + vegetableServing + " servings (" + vegetableCalories + " cal)\n" +
                            "Fruit: " + fruitServing + " servings (" + fruitCalories + " cal)\n\n" +
                            "Total Calories: " + totalCalories + " cal";

            tvResult.setText(result);
        });
    }
}
