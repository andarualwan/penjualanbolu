package com.developer.pembayaranlossdankios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URLEncoder;

public class bayartagihan extends AppCompatActivity {

    private Button whatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayartagihan);

        whatsapp=findViewById(R.id.btnwhatsapp);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "+6289682885900";
                String message = "Halo, Saya ingin melakukan pembayaran tagihan";
                String url = "https://api.whatsapp.com/send?phone=" + phoneNumber + "&text=" + URLEncoder.encode(message);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });


    }
}