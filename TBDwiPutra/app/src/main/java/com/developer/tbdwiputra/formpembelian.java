package com.developer.tbdwiputra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URLEncoder;

public class formpembelian extends AppCompatActivity {

    private Button whatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formpembelian);

        whatsapp = findViewById(R.id.btnwhatsapp);


        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "+62895377050543";
                String message = "Halo, Saya ingin konfirmasi pesanan";
                String url = "https://api.whatsapp.com/send?phone=" + phoneNumber + "&text=" + URLEncoder.encode(message);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}