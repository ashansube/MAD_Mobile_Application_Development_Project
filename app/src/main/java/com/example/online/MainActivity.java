package com.example.online;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MASSAGE = "paynow";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void addPayementMethod(View view) {

        Intent intent = new Intent(this, AddPaymentMethod.class);
        TextView txt = (TextView) findViewById(R.id.buttonpay);
        String massage = txt.getText().toString();
        intent.putExtra(EXTRA_MASSAGE,massage);
        startActivity(intent);

    }

}