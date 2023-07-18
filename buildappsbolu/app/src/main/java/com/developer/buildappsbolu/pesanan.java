package com.developer.buildappsbolu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pesanan extends AppCompatActivity {

    private Button backk,btnorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);

        backk = findViewById (R.id.backk);

        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(pesanan.this,Dashboard.class);
                startActivity(next);
            }
        });
        btnorder = findViewById(R.id.btnorder);
        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(pesanan.this,terimaorderan.class);
                startActivity(next);
            }
        });
    }
}