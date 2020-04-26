package com.example.lab31;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.color_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        TextView textView = (TextView) findViewById(R.id.textView);
        switch (item.getItemId()){
            case R.id.red:
               textView.setBackgroundColor(Color.argb(255, 255, 0, 0));
               textView.setText("Red");
                return true;
            case R.id.blue:
                textView.setBackgroundColor(Color.argb(255, 0, 0, 255));
                textView.setText("Blue");
                return true;
            case R.id.green:
                textView.setBackgroundColor(Color.argb(255, 0, 255, 0));
                textView.setText("Green");
                return true;
            case R.id.yellow:
                textView.setBackgroundColor(Color.argb(255, 255, 255, 0));
                textView.setText("Yellow");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
