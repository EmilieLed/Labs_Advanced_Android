package com.example.lab34;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

public class CountdownActivity extends AppCompatActivity {
 TextView mTextField;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);
        final MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.ringtone);
        Intent intent = getIntent();
        String string = "";
        string = intent.getStringExtra("time");


        int time = Integer.parseInt(string);
        time=time*1000;
        mTextField=(TextView)findViewById(R.id.mTextField);
        new CountDownTimer(time, 1000) {

            public void onTick(long millisUntilFinished) {
                mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                mTextField.setText("done!");

                mediaPlayer.start();
            }
        }.start();

    }
}
