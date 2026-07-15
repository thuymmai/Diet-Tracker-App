package com.example.diettracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button buttonLogin, buttonRegister;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        buttonLogin = findViewById(R.id.buttonlogin);
        buttonRegister = findViewById(R.id.buttonregister);

        message = findViewById(R.id.txtmessage);

        // Open Register screen
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });

        // Login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = username.getText().toString().trim();
                String pass = password.getText().toString().trim();

                login(user, pass);
            }
        });
    }

    private void login(String user, String pass) {

        // Read saved username/password
        String savedUser = getSharedPreferences("UserData", MODE_PRIVATE)
                .getString("username", "");

        String savedPass = getSharedPreferences("UserData", MODE_PRIVATE)
                .getString("password", "");

        if (user.equals(savedUser) && pass.equals(savedPass)) {

            message.setVisibility(View.GONE);

            Toast.makeText(MainActivity.this,
                    "Login Successful!",
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();

        } else {

            message.setVisibility(View.VISIBLE);
            message.setText("Login Failed! Try again or click on Register");

            Toast.makeText(MainActivity.this,
                    "Invalid Username or Password.",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
