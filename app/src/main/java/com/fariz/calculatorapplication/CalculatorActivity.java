package com.fariz.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    EditText angka_pertama, angka_kedua;
    Button tambah, kurang, kali, bagi, bersihkan, dashboard;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        angka_pertama= (EditText) findViewById(R.id.angka_pertama);
        angka_kedua=(EditText) findViewById(R.id.angka_kedua);
        tambah=(Button) findViewById(R.id.tambah);
        kurang=(Button) findViewById(R.id.kurang);
        kali=(Button) findViewById(R.id.kali);
        bagi=(Button) findViewById(R.id.bagi);
        bersihkan=(Button) findViewById(R.id.bersihkan);
        hasil=(TextView) findViewById(R.id.hasil);
        dashboard=(Button)findViewById(R.id.backMenu);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0)){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 + angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(CalculatorActivity.this,"Mohon masukan angka pertama & kedua",Toast.LENGTH_LONG);
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0)){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(CalculatorActivity.this,"Mohon masukan angka pertama & kedua",Toast.LENGTH_LONG);
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0)){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(CalculatorActivity.this,"Mohon masukan angka pertama & kedua",Toast.LENGTH_LONG);
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0)){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(CalculatorActivity.this,"Mohon masukan angka pertama & kedua",Toast.LENGTH_LONG);
                }
            }
        });

        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_pertama.setText("");
                angka_kedua.setText("");
                hasil.setText("O");
                angka_pertama.requestFocus();
            }
        });

        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abt = new Intent(CalculatorActivity.this, MainActivity.class);
                startActivity(abt);
            }
        });
    }
}