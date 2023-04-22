package com.example.temperatureconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    public void onConvertButton(View view)
    {
        EditText editText=findViewById(R.id.editTextNumberDecimal);
        String inputString=editText.getText().toString();
        Double inputDouble=Double.parseDouble(inputString);
        Double outputInFah=(inputDouble*9/5)+32;
        Snackbar.make(view,"Temperature in Celsius "+inputString+" "+"is"+" "+outputInFah+" "+"in Fahrenheit",Snackbar.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}