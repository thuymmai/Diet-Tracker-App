package com.example.diettracker;

import static android.view.View.GONE;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView message;
    EditText username, password;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.txtmessage);
        message.setVisibility(View.INVISIBLE);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        buttonLogin = findViewById(R.id.buttonlogin);

        buttonLogin.setOnClickListener(view -> {
            String user = username.getText().toString();
            String pass = password.getText().toString();
            login(user, pass);
        });

    }

    private void login(String user, String pass) {
        if (user.equals("admin") && pass.equals("pass")) {
            message.setVisibility(GONE);
            Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
            message.setText("Login Failed!");
        }
    }


}