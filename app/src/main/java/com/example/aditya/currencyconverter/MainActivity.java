package com.example.aditya.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText dollarField = (EditText) findViewById(R.id.editText);
        String s= dollarField.getText().toString();

        if (s.matches("")) {
            Toast.makeText(this, "Please Enter a Value!!", Toast.LENGTH_SHORT).show();
            return;
        }

        else {
            Double dollarAmount = Double.parseDouble(dollarField.getText().toString());
            Double convertedAmount = dollarAmount * 65.38;
            TextView textView = (TextView) findViewById(R.id.textView3);
            String amount = Double.toString(convertedAmount);
            textView.setText(amount + " INR");
        }
    }

    public void realConverter(View view) {
        Toast.makeText(MainActivity.this, "This is Multi Currency Converter",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
