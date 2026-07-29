package com.example.diettracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class ViewMeal extends AppCompatActivity {


    EditText etBurger, etSoup, etFriedRice, etNoodle;
    EditText etPizza, etSalad, etChicken;

    Button btnSave, btnBack;

    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_meal);


        etBurger = findViewById(R.id.etBurger);
        etSoup = findViewById(R.id.etSoup);
        etFriedRice = findViewById(R.id.etFriedRice);
        etNoodle = findViewById(R.id.etNoodle);
        etPizza = findViewById(R.id.etPizza);
        etSalad = findViewById(R.id.etSalad);
        etChicken = findViewById(R.id.etChicken);

        tvResult = findViewById(R.id.tvResult);


        btnSave = findViewById(R.id.btnSave);
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(ViewMeal.this, HomeActivity.class);
            startActivity(intent);
            finish();
        });

        btnSave.setOnClickListener(v -> {
            int burger = getNumber(etBurger);
            int soup = getNumber(etSoup);
            int friedRice = getNumber(etFriedRice);
            int noodle = getNumber(etNoodle);
            int pizza = getNumber(etPizza);
            int salad = getNumber(etSalad);
            int chicken = getNumber(etChicken);

            int totalCalories =
                    burger * 500 +
                            soup * 150 +
                            friedRice * 400 +
                            noodle * 350 +
                            pizza * 300 +
                            salad * 100 +
                            chicken * 400;

            String summary =
                    "Total Calories: "
                            + totalCalories
                            + " kcal\n\n" +

                            "Daily Nutrition Summary\n\n" + "🍔 Burger: " + burger +
                            " serving = " + (burger * 500) + " kcal\n" +

                            "🥣 Soup: " + soup +
                            " serving = " + (soup * 150) + " kcal\n" +

                            "🍚 Fried Rice: " + friedRice +
                            " serving = " + (friedRice * 400) + " kcal\n" +

                            "🍜 Noodle: " + noodle +
                            " serving = " + (noodle * 350) + " kcal\n" +

                            "🍕 Pizza: " + pizza +
                            " serving = " + (pizza * 300) + " kcal\n" +

                            "🥗 Salad: " + salad +
                            " serving = " + (salad * 100) + " kcal\n" +

                            "🍗 Fried Chicken: " + chicken +
                            " serving = " + (chicken * 400) + " kcal\n\n" +

                            "--------------------\n" +

                            "Total Calories: " + totalCalories + " kcal";
            Toast.makeText(ViewMeal.this,
                    "Data saved successfully!",
                    Toast.LENGTH_SHORT).show();
            tvResult.setText(summary);
        });
    }


    // If user leaves empty, count as 0
    private int getNumber(EditText editText){

        if(editText.getText().toString().isEmpty()){
            return 0;
        }

        return Integer.parseInt(
                editText.getText().toString()
        );
    }

}