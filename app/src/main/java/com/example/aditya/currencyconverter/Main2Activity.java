package com.example.aditya.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button convert;
    Spinner spinnerFrom;
    Spinner spinnerTo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        convert = (Button)findViewById(R.id.Conversion);

        spinnerFrom = (Spinner) findViewById(R.id.ConvertFrom);
        spinnerTo = (Spinner) findViewById(R.id.ConvertTo);
        ArrayAdapter<CharSequence> adapter;
        adapter = ArrayAdapter.createFromResource(this,R.array.Country,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);

        spinnerFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position)+" selected", Toast.LENGTH_LONG).show();
                if (spinnerFrom.getSelectedItemPosition() == 0 && spinnerTo.getSelectedItemPosition() == 1){
                    convert.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            EditText editText_currency = (EditText)findViewById(R.id.editText_currency);
                            TextView textViewMulti = (TextView) findViewById(R.id.textViewMulti);
                            Double dollarAmount = Double.valueOf(editText_currency.getText().toString());
                            Double convertedAmount1 = dollarAmount * 65.38;
                            String amount = Double.toString(convertedAmount1);
                            textViewMulti.setText(amount);
                            Toast.makeText(getBaseContext(), "You converted to INR", Toast.LENGTH_LONG).show();
                        }
                    });
                }

//                else if (spinnerFrom.getSelectedItemPosition() == 0 && spinnerTo.getSelectedItemPosition() == 2){
//                    Toast.makeText(getBaseContext(), "You converted to GBP", Toast.LENGTH_LONG).show();
//                    convert.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            EditText editText_currency = (EditText)findViewById(R.id.editText_currency);
//                            TextView textViewMulti = (TextView) findViewById(R.id.textViewMulti);
//                            Double dollarAmount = Double.valueOf(editText_currency.getText().toString());
//                            Double convertedAmount2 = dollarAmount * 0.80;
//                            String amount1 = Double.toString(convertedAmount2);
//                            textViewMulti.setText(amount1 + " GBP");
//                        }
//                    });
//                }

            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getBaseContext(),"Please Choose the currency", Toast.LENGTH_LONG).show();
            }
        });

    }

//    public void convertMulti(View view) {
//
//        EditText editText_currency = (EditText)findViewById(R.id.editText2);
//        String s= editText_currency.getText().toString();
//
//        if (s.matches("")) {
//            Toast.makeText(this, "Please Enter a Value!!", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//        Double dollarAmount = Double.valueOf(editText_currency.getText().toString());
//        TextView textViewMulti = (TextView) findViewById(R.id.textViewMulti);
//        //Double currency_from_value = Double.valueOf(editText_currency.getText().toString());
//        String from_currency = String.valueOf(spinnerFrom.getSelectedItem());
//        String to_currency = String.valueOf(spinnerTo.getSelectedItem());
//        if (from_currency == "USD" && to_currency == "INR") {
//            Double convertedAmount1 = dollarAmount * 65.38;
//            String amount = Double.toString(convertedAmount1);
//            textViewMulti.setText(amount + " INR");
//        }
//
//        else if (from_currency == "USD" && to_currency == "GBP") {
//            Double convertedAmount2 = dollarAmount * 0.80;
//            String amount1 = Double.toString(convertedAmount2);
//            textViewMulti.setText(amount1 + " GBP");
//        }
//
//        else if (from_currency == "GBP" && to_currency == "INR") {
//            Double convertedAmount3 = dollarAmount * 81.53;
//            String amount2 = Double.toString(convertedAmount3);
//            textViewMulti.setText(amount2 + " INR");
//        }
//
//        else if (from_currency == "GBP" && to_currency == "USD") {
//            Double convertedAmount4 = dollarAmount * 1.25;
//            String amount3 = Double.toString(convertedAmount4);
//            textViewMulti.setText(amount3 + " USD");
//        }
//
//
//    }

    public void returnToBasic(View view) {
        Toast.makeText(Main2Activity.this, "This is Basic Currency Converter",Toast.LENGTH_SHORT).show();
        finish();
    }

}
