package com.example.portfolio;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference UI elements
        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewDescription = findViewById(R.id.textViewDescription);
        TextView textViewEmail = findViewById(R.id.textViewEmail);

        // Set your information
        textViewName.setText("Your Name");
        textViewDescription.setText("Hello! I am a mobile app developer...");
        textViewEmail.setText("Email: example@email.com");
    }
}
