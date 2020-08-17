package com.example.madtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class settings extends AppCompatActivity {

    Button contactus;
    Button aboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }



    public void conus(View view) {
        startActivity(new Intent(getApplicationContext(), contactus.class));
    }

    public void aboutus(View view) {
        startActivity(new Intent(getApplicationContext(), aboutus.class));
    }


    public void setback(View view) {
        startActivity(new Intent(getApplicationContext(), aboutus.class));
    }
}