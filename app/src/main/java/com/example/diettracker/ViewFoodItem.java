package com.example.diettracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ViewFoodItem extends AppCompatActivity {

    EditText etProtein, etRice, etVegetable, etFruit;
    Button btnSave;
    Button btnBack;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_food_item);

        etProtein = findViewById(R.id.etProtein);
        etRice = findViewById(R.id.etRice);
        etVegetable = findViewById(R.id.etVegetable);
        etFruit = findViewById(R.id.etFruit);

        btnSave = findViewById(R.id.btnSave);
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(ViewFoodItem.this, HomeActivity.class);
            startActivity(intent);
            finish();
        });
        tvResult = findViewById(R.id.tvResult);

        btnSave.setOnClickListener(v -> {
            Toast.makeText(ViewFoodItem.this,
                    "Data saved successfully!",
                    Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ViewFoodItem.this, HomeActivity.class);
            startActivity(intent);
            finish();
            String protein = etProtein.getText().toString();
            String rice = etRice.getText().toString();
            String vegetable = etVegetable.getText().toString();
            String fruit = etFruit.getText().toString();

            if(protein.isEmpty()) protein = "0";
            if(rice.isEmpty()) rice = "0";
            if(vegetable.isEmpty()) vegetable = "0";
            if(fruit.isEmpty()) fruit = "0";

            String result =
                    "Today's Intake\n\n" +
                            "Protein: " + protein + " servings\n" +
                            "Rice: " + rice + " cups\n" +
                            "Vegetables: " + vegetable + " servings\n" +
                            "Fruit: " + fruit + " servings";

            tvResult.setText(result);

        });
    }
}