package com.developer.senjaadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menulayanan extends AppCompatActivity {

    private Button btnmenu,btnperaturan,btnkontak,btnjamrental,btnkeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulayanan);

        btnmenu=findViewById(R.id.btnmenu);
        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(menulayanan.this,menu1.class);
                startActivity(next);
            }
        });

        btnperaturan=findViewById(R.id.btnperaturan);
        btnperaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(menulayanan.this,peraturan.class);
                startActivity(next);
            }
        });

        btnkontak=findViewById(R.id.btnkontak);
        btnkontak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(menulayanan.this,kontak.class);
                startActivity(next);
            }
        });

        btnjamrental=findViewById(R.id.btnjamrental);
        btnjamrental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(menulayanan.this,jamrental.class);
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