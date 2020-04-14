package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bttn_ask = (Button) findViewById(R.id.bttn_ask);
        final ImageView ballDisplay = (ImageView) findViewById(R.id.img_eightBall);

        final int ballArray[]= {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        bttn_ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int intNextBall;
                Random randomNumberGen = new Random();
                intNextBall = randomNumberGen.nextInt(5);
                Log.d("8Ball", "The random number1:" + intNextBall);
                ballDisplay.setImageResource(ballArray[intNextBall]);

            }
        });



    }
}
