package com.example.lab22;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout verLayout = new LinearLayout(this);
        verLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout btnLayout = new LinearLayout(this);
        Button addBtn = new Button(this);
        addBtn.setText("Add");
        Button editBtn = new Button(this);
        editBtn.setText("Edit");
        Button removeBtn = new Button(this);
        removeBtn.setText("Remove");
        btnLayout.addView(removeBtn);
        btnLayout.addView(addBtn);
        btnLayout.addView(editBtn);
        verLayout.addView(btnLayout);
        final EditText editText=new EditText(this);
        verLayout.addView(editText);
        ListView listView=new ListView(this);
        verLayout.addView(listView);
        setContentView(verLayout);

        final ArrayList<String> COUNTRIES = new ArrayList<String>();
        COUNTRIES.add("Afguanistan");
        COUNTRIES.add("Albania");
        COUNTRIES.add("Algeria");
        COUNTRIES.add("Andorra");
        COUNTRIES.add("Antartica");

        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, COUNTRIES);
        listView.setAdapter(aa);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textValue=editText.getText().toString();
                COUNTRIES.add(textValue);


            }
        });
        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int lenght=0;
                int pos=0;
                lenght=COUNTRIES.size();
                String textValue=editText.getText().toString();
                for(int i=0;i>=lenght;i++){
                    String element=COUNTRIES.get(i);
                    if(textValue==element){
                        pos=i;
                    }
                }
                COUNTRIES.remove(pos);

            }
        });
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
