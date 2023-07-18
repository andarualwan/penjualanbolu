package com.learn.projectrisetoperasi_andaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Perkalian extends AppCompatActivity {

    EditText d,e;

    TextView f;

    Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkalian);
        d=(EditText) findViewById(R.id.input3);
        e=(EditText) findViewById(R.id.input4);
        f=(TextView) findViewById(R.id.hasil2);
        hitung=(Button) findViewById(R.id.hitung2) ;
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double angka1=Double.parseDouble(d.getText().toString());
                double angka2=Double.parseDouble(e.getText().toString());
                double hsl=angka1*angka2;
                f.setText(Double.toString(hsl));
            }
        });
    }
}