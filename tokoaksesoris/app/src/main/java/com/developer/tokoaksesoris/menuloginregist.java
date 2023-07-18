package com.developer.tokoaksesoris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class menuloginregist extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnLogin;

    private String username = "admin";
    private String password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuloginregist);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().equalsIgnoreCase(username) && etPassword.getText().toString().equalsIgnoreCase(password)){
                    Intent login = new Intent(menuloginregist.this, menulayanan.class);
                    startActivity(login);

                    Toast.makeText(menuloginregist.this, "LOGIN BERHASIL!!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(menuloginregist.this, "Username atau Password Yang Anda Masukkan Salah!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}