package com.example.lab34;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button startBtn;
    public static final String EXTRA_MESSAGE = "0";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startBtn=(Button)findViewById(R.id.startBtn);
        final EditText editText = (EditText) findViewById(R.id.edittext);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                Intent intent = new Intent(getApplicationContext(), CountdownActivity.class);
                intent.putExtra("time",string);
                startActivity(intent);

            }
        });
    }
}
