package com.example.testpi;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LongitudActivity extends AppCompatActivity {
    Spinner spinnerLongitud;
    EditText valorLongitud;
    Button calcularLongitud;
    TextView resultadoLongitud;

    Button btnBorrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);

        Spinner spinnerLongitud = findViewById(R.id.spinnerLongitud);
        EditText valorLongitud = findViewById(R.id.valorLongitud);
        Button btnCalcular = findViewById(R.id.calcularLongitud);
        TextView resultadoLongitud = findViewById(R.id.resultadoLongitud);
        Button btnBorrar = findViewById(R.id.BorrarLongitud);
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorLongitud.setText("");
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Seleccion = spinnerLongitud.getSelectedItem().toString();
                double valor = Double.parseDouble(valorLongitud.getText().toString());
                if (Seleccion.equals("De Metros a Pies")) {
                    Longitud longitud = new Longitud("Metros", "Pies");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (Seleccion.equals("De Pies a Metros")) {
                    Longitud longitud = new Longitud("Pies", "Metros");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (Seleccion.equals("De Millas a Kilómetros")) {
                    Longitud longitud = new Longitud("Kilómetros", "Millas");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (Seleccion.equals("De Kilómetros a Millas")) {
                    Longitud longitud = new Longitud("Kilómetros", "Millas");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
            }
        });
    }
}