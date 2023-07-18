package com.developer.tokoalpen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnloginmenu,btndaftarmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnloginmenu = findViewById(R.id.btnloginmenu);
        btnloginmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this,login.class);
                startActivity(next);
            }
        });

        btndaftarmenu = findViewById(R.id.btndaftarmenu);
        btndaftarmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this,daftar.class);
                startActivity(next);
            }
        });
    }
}