package com.learn.projectrisetoperasi_andaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {

    EditText a,b;
    TextView c;
    Button hitung,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        a=(EditText) findViewById(R.id.input1);
        b=(EditText) findViewById(R.id.input2);
        c=(TextView) findViewById(R.id.hasil);
        hitung=(Button) findViewById(R.id.tambah);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double angka1=Double.parseDouble(a.getText().toString());
                double angka2=Double.parseDouble(b.getText().toString());
                double hsl=angka1+angka2;
                c.setText(Double.toString(hsl));
                b2=(Button) findViewById(R.id.btn2);
                        b2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent i1=new Intent(Kalkulator.this,Perkalian.class);
                                startActivity(i1);
                            }
                        });

            }
        });
    }
}