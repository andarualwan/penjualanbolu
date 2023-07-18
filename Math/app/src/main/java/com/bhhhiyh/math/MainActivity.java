package com.bhhhiyh.math;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText in;
    TextView out;
    ImageButton a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in=(EditText) findViewById(R.id.input);
        out=(TextView) findViewById(R.id.output);
        a=(ImageButton) findViewById(R.id.sin);
        b=(ImageButton) findViewById(R.id.cos);
        c=(ImageButton) findViewById(R.id.tan);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double masukan = Double.parseDouble(in.getText().toString());
                double hasil = Math.sin(masukan);
                out.setText(Double.toString(hasil));
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double masukan = Double.parseDouble(in.getText().toString());
                double hasil = Math.cos(masukan);
                out.setText(Double.toString(hasil));
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double masukan = Double.parseDouble(in.getText().toString());
                double hasil = Math.tan(masukan);
                out.setText(Double.toString(hasil));
            }
        });
    }
}