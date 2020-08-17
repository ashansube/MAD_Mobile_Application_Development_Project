package com.example.madtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class contactsuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactsuccess);
    }

    public void consucback(View view) {
        startActivity(new Intent(getApplicationContext(), contactus.class));
    }


    
}