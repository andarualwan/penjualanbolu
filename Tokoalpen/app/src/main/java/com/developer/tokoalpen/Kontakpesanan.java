package com.developer.tokoalpen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URLEncoder;

public class Kontakpesanan extends AppCompatActivity {

    private Button whatsapp,maps;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontakpesanan);

        whatsapp=findViewById(R.id.btnwhatsappp);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "+6285290070747";
                String message = "Halo, Saya ingin melakukan pemesanan pesanan";
                String url = "https://api.whatsapp.com/send?phone=" + phoneNumber + "&text=" + URLEncoder.encode(message);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        maps=findViewById(R.id.btnmaps);

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://maps.app.goo.gl/hgVdPQB13L5WewVz7";
                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}