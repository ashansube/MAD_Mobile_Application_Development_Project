package com.example.madtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class contactus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
    }

    public void backcon(View view) {
        startActivity(new Intent(getApplicationContext(), settings.class));
    }

    public void submit(View view) {
        startActivity(new Intent(getApplicationContext(), contactsuccess.class));
    }
}