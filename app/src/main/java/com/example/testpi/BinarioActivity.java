package com.example.testpi;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class BinarioActivity extends AppCompatActivity {
    Spinner spinnerBinario;
    EditText valorBinario;
    Button btnCalcularBinario;
    TextView resultadoBinario;

    Button btnBorrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binario);

        Spinner spinnerBinario = findViewById(R.id.spinnerBinario);
        EditText valorBinario = findViewById(R.id.valorBinario);
        Button btnCalcularBinario = findViewById(R.id.btnCalcularBinario);
        TextView resultadoBinario = findViewById(R.id.resultadoBinario);
        Button btnBorrar = findViewById(R.id.BorrarBinario);

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorBinario.setText("");
            }
        });

        btnCalcularBinario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String paisSeleccionado = spinnerBinario.getSelectedItem().toString();
                double valor = Double.parseDouble(valorBinario.getText().toString());
                if (paisSeleccionado.equals("Decimal->Binario")) {
                    Temperatura temperatura = new Temperatura("Decimal", "Binario");
                    resultadoBinario.setText(String.valueOf(temperatura.convertir(valor)));
                }
                if (paisSeleccionado.equals("Binario->Decimal")) {
                    Temperatura temperatura = new Temperatura("Binario", "Decimal");
                    resultadoBinario.setText(String.valueOf(temperatura.convertir(valor)));

                }
                if (paisSeleccionado.equals("Decimal->Hexadecimal")) {
                    Temperatura temperatura = new Temperatura("Decimal", "Hexadecimal");
                    resultadoBinario.setText(String.valueOf(temperatura.convertir(valor)));
                }
                if (paisSeleccionado.equals("Hexadecimal->Decimal")) {
                    Temperatura temperatura = new Temperatura("Hexadecimal", "Decimal");
                    resultadoBinario.setText(String.valueOf(temperatura.convertir(valor)));
                }
            }
        });
    }
}