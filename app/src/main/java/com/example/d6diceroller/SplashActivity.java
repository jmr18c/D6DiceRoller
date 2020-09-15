package com.example.d6diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int wait = 10;
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
        finish();
    }
}