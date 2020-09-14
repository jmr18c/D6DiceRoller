package com.example.d6diceroller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNum = rng.nextInt(20) + 1;

        switch (randomNum) {
            case 1:
                imageViewDice.setImageResource(R.drawable.michigan_1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.michigan_state_2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.penn_state_3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.wisconsin_4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.alabama_5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.iowa_6);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.purdue_7);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.oklahoma_8);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.texas_am_9);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.texas_tech_10);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.georgia_11);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.clemson_12);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.tcu_13);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.oregon_14);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.baylor_15);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.navy_16);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.army_17);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.acu_18);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.texas_19);
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.ohio_state_20);
                break;
        }
    }
}