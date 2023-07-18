package com.developer.buildappsbolu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {
    private Button Back2;
    private ImageButton ori,coklat,coklatkeju,keju,pandan,meses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Back2 = findViewById(R.id.back2);
                Back2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent next = new Intent(Menu.this,Dashboard.class);
                        startActivity(next);
                    }
                });
        ori = findViewById(R.id.original);

        ori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this,original.class);
                startActivity(next);
            }
        });

        coklat = findViewById(R.id.coklat);

        coklat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this,coklar.class);
                startActivity(next);
            }
        });

        coklatkeju = findViewById(R.id.coklatkeju);

        coklatkeju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this,coklatkeju.class);
                startActivity(next);
            }
        });

        keju = findViewById(R.id.keju);

        keju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next =new Intent(Menu.this, com.developer.buildappsbolu.keju.class);
                startActivity(next);
            }
        });

        pandan = findViewById(R.id.pandan);

        pandan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this,pandan.class);
                startActivity(next);
            }
        });

        meses = findViewById(R.id.meses);

        meses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(Menu.this,meses.class);
                startActivity(next);
            }
        });

    }
}