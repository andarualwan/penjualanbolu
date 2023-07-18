package com.developer.tbdwiputra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selamatdatang extends AppCompatActivity {

    private Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selamatdatang);

        btnnext = findViewById(R.id.btnnext);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(selamatdatang.this,Dashboard.class);
                startActivity(next);
            }
        });
    }
}