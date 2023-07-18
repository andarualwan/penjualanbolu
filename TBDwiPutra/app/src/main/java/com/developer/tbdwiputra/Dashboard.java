package com.developer.tbdwiputra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Dashboard extends AppCompatActivity {

    private ImageButton menu,peraturan,btnkeluar,kontak,btnpembayaran;

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

        peraturan =findViewById(R.id.btnperaturan);
        peraturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Dashboard.this,Peraturan.class);
                startActivity(next);
            }
        });

        kontak=findViewById(R.id.btnkontak);
        kontak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Dashboard.this,Kontak.class);
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
        btnpembayaran=findViewById(R.id.btnpayment);
        btnpembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Dashboard.this,formpembelian.class);
                startActivity(next);
            }
        });

    }
}