package com.developer.buildappsbolu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Riwayat extends AppCompatActivity {

    private Button back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);

        back1 = findViewById (R.id.btnback1);

                back1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent next = new Intent(Riwayat.this,Dashboard.class);
                        startActivity(next);
                    }
                });
    }
}