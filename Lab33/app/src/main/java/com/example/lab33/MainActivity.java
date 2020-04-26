package com.example.lab33;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageButton imageButton1 = (ImageButton)findViewById(R.id.imagebutton1);
        ImageButton imageButton2 = (ImageButton)findViewById(R.id.imagebutton2);
        ImageButton imageButton3 = (ImageButton)findViewById(R.id.imagebutton3);
        ImageButton imageButton4 = (ImageButton)findViewById(R.id.imagebutton4);

        mediaPlayer1 = MediaPlayer.create(this, R.raw.bear);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.wolf);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.elephant);
        mediaPlayer4 = MediaPlayer.create(this, R.raw.lamb);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer1.start();
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer3.start();
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer4.start();
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.animal_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.birds:
                ((ImageButton)findViewById(R.id.imagebutton1)).setImageResource(R.drawable.huuhkaja);
                ((ImageButton)findViewById(R.id.imagebutton2)).setImageResource(R.drawable.peippo);
                ((ImageButton)findViewById(R.id.imagebutton3)).setImageResource(R.drawable.peukaloinen);
                ((ImageButton)findViewById(R.id.imagebutton4)).setImageResource(R.drawable.punatulkku);
                mediaPlayer1 = MediaPlayer.create(this, R.raw.huuhkaja_norther_eagle_owl);
                mediaPlayer2 = MediaPlayer.create(this, R.raw.peippo_chaffinch);
                mediaPlayer3 = MediaPlayer.create(this, R.raw.peukaloinen_wren);
                mediaPlayer4 = MediaPlayer.create(this, R.raw.punatulkku_northern_bullfinch);
                return true;
            case R.id.mammals:
                ((ImageButton)findViewById(R.id.imagebutton1)).setImageResource(R.drawable.bear);
                ((ImageButton)findViewById(R.id.imagebutton2)).setImageResource(R.drawable.wolf);
                ((ImageButton)findViewById(R.id.imagebutton3)).setImageResource(R.drawable.elephant);
                ((ImageButton)findViewById(R.id.imagebutton4)).setImageResource(R.drawable.lamb);
                mediaPlayer1 = MediaPlayer.create(this, R.raw.bear);
                mediaPlayer2 = MediaPlayer.create(this, R.raw.wolf);
                mediaPlayer3 = MediaPlayer.create(this, R.raw.elephant);
                mediaPlayer4 = MediaPlayer.create(this, R.raw.lamb);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
