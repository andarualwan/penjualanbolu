package com.developer.tbdwiputra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kontak extends AppCompatActivity {

    private Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);

        kembali = findViewById(R.id.kembalii);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Kontak.this,Dashboard.class);
                startActivity(next);
            }
        });

    }
}