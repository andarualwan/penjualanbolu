package com.developer.tokoaksesoris;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class regist extends AppCompatActivity {

    private Button btndaftar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        btndaftar=findViewById(R.id.btndaftar);
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(regist.this,menulayanan.class);
                startActivity(next);
            }
        });
    }
}