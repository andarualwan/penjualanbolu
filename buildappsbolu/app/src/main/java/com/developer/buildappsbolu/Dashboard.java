package com.developer.buildappsbolu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Dashboard extends AppCompatActivity {

    private ImageButton menu,btnpesanan,btnhistory,btnkeluar,btnperaturan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        menu =findViewById(R.id.btnmenu);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Dashboard.this,Menu.class);
                startActivity(next);
            }
        });

        btnpesanan =findViewById(R.id.btnpesanan);
        btnpesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Dashboard.this,pesanan.class);
                startActivity(next);
            }
        });

        btnhistory=findViewById(R.id.btnhistory);
        btnhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Dashboard.this,Riwayat.class);
                startActivity(next);
            }
        });

        btnkeluar=findViewById(R.id.btnkeluar);
        btnkeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Dashboard.this,MainActivity.class);
                startActivity(next);
            }
        });

        btnperaturan=findViewById(R.id.btnperaturan);
        btnperaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Dashboard.this,peraturan.class);
                startActivity(next);
            }
        });
    }
}