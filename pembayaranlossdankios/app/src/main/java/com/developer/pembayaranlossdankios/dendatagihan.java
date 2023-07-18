package com.developer.pembayaranlossdankios;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dendatagihan extends AppCompatActivity {

    private Button bayartagihan;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dendatagihan);

        bayartagihan=findViewById(R.id.btnbayartagihan);
        bayartagihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(dendatagihan.this,bayartagihan.class);
                startActivity(next);
            }
        });
    }
}