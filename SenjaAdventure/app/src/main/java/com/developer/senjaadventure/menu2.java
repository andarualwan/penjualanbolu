package com.developer.senjaadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu2 extends AppCompatActivity {

    private Button btnbackdua;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        btnbackdua=findViewById(R.id.btnkembali);
        btnbackdua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(menu2.this,menu1.class);
                startActivity(next);
            }
        });
    }
}