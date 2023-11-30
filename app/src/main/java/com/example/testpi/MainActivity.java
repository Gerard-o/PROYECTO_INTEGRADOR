package com.example.testpi;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTemperatura, btnPeso, btnDivisa, btnLongitud, btnBinario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTemperatura = findViewById(R.id.btnTemperatura);
        Button btnPeso = findViewById(R.id.btnPeso);
        Button btnDivisa = findViewById(R.id.btnDivisa);
        Button btnLongitud = findViewById(R.id.btnLongitud);
        Button btnBinario = findViewById(R.id.btnBinario);

        btnTemperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TemperaturaActivity.class);
                startActivity(intent);
            }
        });
        btnPeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PesoActivity.class);
                startActivity(intent);
            }
        });

        btnDivisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DivisaActivity.class);
                startActivity(intent);
            }
        });

        btnLongitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LongitudActivity.class);
                startActivity(intent);
            }
        });

        btnBinario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BinarioActivity.class);
                startActivity(intent);
            }
        });
    }
}
