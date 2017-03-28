package com.example.aditya.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static String DA ="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w(DA,"Inside DataActivity:OnCreate\n");

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
            Double convertedAmount = dollarAmount * 65.37;
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
    protected void onStart() {
        super.onStart();
        Log.w(DA, "OnStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(DA, "OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(DA, "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(DA, "OnPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(DA, "OnDestroy");
    }
}


