package com.example.online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class OrdersToBeRecived extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_to_be_recived);
    }

    public void viewOrder(View view) {
        Intent intent = new Intent(this,UpdateOrder.class);

        startActivity(intent);
    }

    public void notifi(View view) {
        Intent intent = new Intent(this,Notification.class);
        startActivity(intent);
    }


}