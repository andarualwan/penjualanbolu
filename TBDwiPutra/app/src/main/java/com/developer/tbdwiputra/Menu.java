package com.developer.tbdwiputra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    private Button backk2;
    private ImageButton semen,amplas,triplek,paku,kunci,cattembok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        backk2 = findViewById(R.id.back2);

        backk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this,Dashboard.class);
                startActivity(next);
            }
        });

        semen = findViewById(R.id.semen);

        semen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this,semen.class);
                startActivity(next);
            }
        });

        amplas = findViewById(R.id.amplas);

        amplas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this,amplas.class);
                startActivity(next);
            }
        });

        triplek = findViewById(R.id.triplek);

        triplek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this,triplek.class);
                startActivity(next);
            }
        });

        paku = findViewById(R.id.paku);

        paku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this,paku.class);
                startActivity(next);
            }
        });

        kunci = findViewById(R.id.kunci);

        kunci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this,kunci.class);
                startActivity(next);
            }
        });

        cattembok = findViewById(R.id.cattembok);

        cattembok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this,cattembok.class);
                startActivity(next);
            }
        });
    }
}