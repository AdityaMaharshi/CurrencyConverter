package com.example.aditya.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void returnToBasic(View view) {
        Toast.makeText(Main2Activity.this, "This is Basic Currency Converter",Toast.LENGTH_SHORT).show();
        finish();
    }
}
