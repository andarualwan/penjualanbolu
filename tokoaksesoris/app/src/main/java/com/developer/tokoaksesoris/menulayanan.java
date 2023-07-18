package com.developer.tokoaksesoris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menulayanan extends AppCompatActivity {

    private Button produk,formpesanan,jambuka,keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulayanan);

        produk=findViewById(R.id.btnproduk);
        produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(menulayanan.this,produk.class);
                startActivity(next);
            }
        });

        formpesanan=findViewById(R.id.btnformpesan);
        formpesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(menulayanan.this,formpesanan.class);
                startActivity(next);
            }
        });

        jambuka=findViewById(R.id.btnjambuka);
        jambuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(menulayanan.this,jambuka.class);
                startActivity(next);
            }
        });

        keluar=findViewById(R.id.btnkeluar);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(menulayanan.this,MainActivity.class);
                startActivity(next);
            }
        });
    }
}