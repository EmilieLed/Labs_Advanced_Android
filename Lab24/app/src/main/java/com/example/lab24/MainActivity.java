package com.example.lab24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button engBtn=(Button)findViewById(R.id.engBtn);
        Button sveBtn=(Button)findViewById(R.id.sveBtn);
        Button finBtn=(Button)findViewById(R.id.finBtn);
        Button supBtn=(Button)findViewById(R.id.supBtn);
        final TextView greet=(TextView)findViewById(R.id.txtgreet);
        final EditText name=(EditText)findViewById(R.id.name);

        engBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameValue = name.getText().toString();
                greet.setText("Hi "+ nameValue); //set text for text view

            }
        });
        sveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameValue = name.getText().toString();
                greet.setText("Hejjsan "+ nameValue); //set text for text view

            }
        });
        finBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameValue = name.getText().toString();
                greet.setText("Terve "+ nameValue); //set text for text view

            }
        });
        supBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameValue = name.getText().toString();
                greet.setText("Hola "+ nameValue); //set text for text view

            }
        });
    }
}
