package com.example.online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AddPaymentMethod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_payment_method);

        Intent intent = getIntent();
        String massage = intent.getStringExtra(MainActivity.EXTRA_MASSAGE);

        TextView textView = findViewById(R.id.textView);
        textView.setText(massage);

    }

    public void addOrder(View view) {
        Intent intent1 = new Intent(this, OrdersToBeRecived.class);
        startActivity(intent1);
    }
}