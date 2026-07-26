package com.example.diettracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button = (Button) findViewById(R.id.buttonViewMeal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openViewFoodItem();
            }
        });
    }

    public void openViewFoodItem() {
        Intent intent = new Intent(this, ViewFoodItem.class);
        startActivity(intent);
    }

    EditText simpleEditText = (EditText) findViewById(R.id.userInput);

    String strValue = simpleEditText.getText().toString();

    //convert it to integer type for calculations
    int number = Integer.parseInt(strValue);
}