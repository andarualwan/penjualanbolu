package com.developer.tokoalpen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class daftar extends AppCompatActivity {

    private Button btndaftar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        btndaftar = findViewById(R.id.btndaftar);
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(daftar.this,Menu.class);
                startActivity(next);
            }
        });

    }
}