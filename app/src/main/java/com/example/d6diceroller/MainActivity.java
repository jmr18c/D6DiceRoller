package com.example.d6diceroller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private MediaPlayer diceRollMP;

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

        diceRollMP = MediaPlayer.create(this, R.raw.dice_roll);
        diceRollMP.start();

        TextView critHitTextView = (TextView) findViewById(R.id.crit_hit_id);
        TextView critMissTextView = (TextView) findViewById(R.id.crit_miss_id);

        switch (randomNum) {
            case 1:
                imageViewDice.setImageResource(R.drawable.michigan_1);
                critMissTextView.setVisibility(View.VISIBLE);
                critHitTextView.setVisibility(View.INVISIBLE);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.michigan_state_2);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.penn_state_3);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.wisconsin_4);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.alabama_5);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.iowa_6);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.purdue_7);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.oklahoma_8);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.texas_am_9);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.texas_tech_10);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.georgia_11);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.clemson_12);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.tcu_13);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.oregon_14);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.baylor_15);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.navy_16);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.army_17);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.acu_18);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.texas_19);
                critHitTextView.setVisibility(View.INVISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.ohio_state_20);
                critHitTextView.setVisibility(View.VISIBLE);
                critMissTextView.setVisibility(View.INVISIBLE);
                break;
        }
    }
}