package com.developer.tokoalpen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button produk,jamtoko,pesanan,aturan,kontak,keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        produk = findViewById(R.id.btnmenu);
        jamtoko = findViewById(R.id.btnjamtoko);
        pesanan = findViewById(R.id.btnformulir);
        aturan = findViewById(R.id.btnperaturan);
        kontak = findViewById(R.id.btnkontak);
        keluar = findViewById(R.id.btnkeluar);
        produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this, com.developer.tokoalpen.produk.class);
                startActivity(next);
            }
        });
        jamtoko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this, jamtoko.class);
                startActivity(next);
            }
        });
        pesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this,pesanan.class);
                startActivity(next);
            }
        });
        aturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this, aturan.class);
                startActivity(next);
            }
        });
        kontak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this, Kontakpesanan.class);
                startActivity(next);
            }
        });
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this, MainActivity.class);
                startActivity(next);
            }
        });
    }
}