package com.example.madtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }

    public void gdbtn(View view) {
        startActivity(new Intent(getApplicationContext(), graphicanddesign.class));
    }

    public void progbtn(View view) {
        startActivity(new Intent(getApplicationContext(), Programming.class));
    }

    public void writbtn(View view) {
        startActivity(new Intent(getApplicationContext(), writing.class));
    }

    public void dmbtn(View view) {
        startActivity(new Intent(getApplicationContext(), digitalmarketing.class));
    }
}