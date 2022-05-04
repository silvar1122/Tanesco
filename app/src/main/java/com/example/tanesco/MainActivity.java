package com.example.tanesco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.tanesco.adapters.SpinnerCustomAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner_1,spinner_2,spinner_3,spinner_4,spinner_5;
    ArrayList<String>items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_1=findViewById(R.id.spinner_1);
        spinner_2=findViewById(R.id.spinner_2);
        spinner_3=findViewById(R.id.spinner_3);
        spinner_4=findViewById(R.id.spinner_4);
        spinner_5=findViewById(R.id.spinner_5);
        items=new ArrayList<>();
        items.add("Trial");
        items.add("Trial");
        items.add("Trial");
        items.add("Trial");

        SpinnerCustomAdapter spinnerCustomAdapter=new SpinnerCustomAdapter(getApplicationContext(),items);
        spinner_1.setAdapter(spinnerCustomAdapter);
        spinner_2.setAdapter(spinnerCustomAdapter);
        spinner_3.setAdapter(spinnerCustomAdapter);
        spinner_4.setAdapter(spinnerCustomAdapter);
        spinner_5.setAdapter(spinnerCustomAdapter);
    }
}