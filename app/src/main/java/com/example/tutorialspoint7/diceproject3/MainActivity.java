package com.example.tutorialspoint7.diceproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    ImageView dice;
    Image image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice = (ImageView)findViewById(R.id.dice);
        dice.setImageResource(R.drawable.dice_1);






    }

    public void Roll(View view){

        int side = (int)(Math.random()*6)+1; //6 Max 1 Min

        switch(side){
            case 1:
                dice.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                dice.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                dice.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                dice.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                dice.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                dice.setImageResource(R.drawable.dice_6);
                break;

        };




    }
}
