package com.developer.tbdwiputra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Peraturan extends AppCompatActivity {

    private Button bebekkk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peraturan);

        bebekkk = findViewById(R.id.kembaliii);

        bebekkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Peraturan.this,Dashboard.class);
                startActivity(next);
            }
        });

    }
}