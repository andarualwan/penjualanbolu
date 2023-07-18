package com.developer.pembayaranlossdankios;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menulayanan extends AppCompatActivity {

    private Button btntagihan,btndenda,btnbayar,btnkeluar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulayanan);

        btntagihan=findViewById(R.id.btntagihan);
        btntagihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(menulayanan.this,tagihansewa.class);
                startActivity(next);
            }
        });

        btndenda=findViewById(R.id.btndetailtagihan);
        btndenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(menulayanan.this,dendatagihan.class);
                startActivity(next);
            }
        });

        btnbayar=findViewById(R.id.btnbayar);
        btnbayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(menulayanan.this,bayartagihan.class);
                startActivity(next);
            }
        });

        btnkeluar=findViewById(R.id.btnkeluar);
        btnkeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(menulayanan.this,MainActivity.class);
                startActivity(next);
            }
        });
    }
}