package com.bhhhiyh.bosseboluapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username, Password;
    private Button btnlogin;
    private String username = "bhhhiyh";
    private String password = "Admin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        Password = findViewById(R.id.Password);
        btnlogin = findViewById(R.id.btnloggin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equalsIgnoreCase(username) && Password.getText().toString().equalsIgnoreCase(Password)) {
                    intent login = new Intent(MainActivity.this, Dashboard.class);
                    startActivity(login);

                    Toast.makeText(MainActivity.this, "Login Berhasil!!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Username atau password yang anda masukan salah ", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}