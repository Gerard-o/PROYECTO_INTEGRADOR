package com.example.testpi;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class DivisaActivity extends AppCompatActivity {
    Spinner spinnerDivisa;
    EditText valorDivisa;
    Button btnCalcular;
    TextView resultadoDivisa;

    Button btnBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisa);

        Spinner spinnerDivisa = findViewById(R.id.spinnerDivisa);
        EditText valorDivisa = findViewById(R.id.valorDivisa);
        Button btnCalcular = findViewById(R.id.btnCalcularDivisa);
        TextView resultadoDivisa = findViewById(R.id.resultadoDivisa);
        Button btnBorrar = findViewById(R.id.BorrarDivisa);

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorDivisa.setText("");
            }
        });
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String paisSeleccionado = spinnerDivisa.getSelectedItem().toString();
                double valor = Double.parseDouble(valorDivisa.getText().toString());
                if (paisSeleccionado.equals("De USDT a EURO")) {
                    Divisa divisa = new Divisa("USDT", "EURO");
                    resultadoDivisa.setText(String.valueOf(divisa.convertir(valor)));
                }
                if (paisSeleccionado.equals("De EURO a USDT")) {
                    Divisa divisa = new Divisa("EURO", "USDT");
                    resultadoDivisa.setText(String.valueOf(divisa.convertir(valor)));
                }
                if (paisSeleccionado.equals("De USDT a COP")) {
                    Divisa divisa = new Divisa("USDT", "COP");
                    resultadoDivisa.setText(String.valueOf(divisa.convertir(valor)));
                }
                if (paisSeleccionado.equals("De COP a USDT")) {
                    Divisa divisa = new Divisa("COP", "USDT");
                    resultadoDivisa.setText(String.valueOf(divisa.convertir(valor)));




                }
            }
        });
    }
}