package com.developer.pembayaranlossdankios;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tagihansewa extends AppCompatActivity {

    private Button btnnexttt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagihansewa);

        btnnexttt=findViewById(R.id.btnnextt);
        btnnexttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(tagihansewa.this,dendatagihan.class);
                startActivity(next);

            }
        });
    }
}