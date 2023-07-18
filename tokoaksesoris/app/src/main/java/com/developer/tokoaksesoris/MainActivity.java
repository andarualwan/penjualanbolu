package com.developer.tokoaksesoris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnnext,btnregist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnnext=findViewById(R.id.btnnext);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this,menuloginregist.class);
                startActivity(next);
            }
        });

        btnregist=findViewById(R.id.btnregist);
        btnregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this,regist.class);
                startActivity(next);
            }
        });
    }
}