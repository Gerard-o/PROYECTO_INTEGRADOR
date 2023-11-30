package com.example.testpi;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TemperaturaActivity extends AppCompatActivity {
    Spinner spinnerTemperatura;
    EditText valorTemperatura;
    Button btnCalcular;
    TextView resultadoTemperatura;

    Button btnBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        Spinner spinnerTemperatura = findViewById(R.id.spinnerTemperatura);
        EditText valorTemperatura = findViewById(R.id.valorTemperatura);
        Button btnCalcular = findViewById(R.id.btnCalcularTemperatura);
        TextView resultadoTemperatura = findViewById(R.id.resultadoTemperatura);
        Button btnBorrar = findViewById(R.id.BorrarTemperatura);

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorTemperatura.setText("");
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Seleccion = spinnerTemperatura.getSelectedItem().toString();
                double valor = Double.parseDouble(valorTemperatura.getText().toString());
                if (Seleccion.equals("De Celsius a Fahrenheit")) {
                    Temperatura temperatura = new Temperatura("Celsius", "Fahrenheit");
                    resultadoTemperatura.setText(String.valueOf(temperatura.convertir(valor)));
                }
                if (Seleccion.equals("De Fahrenheit a Celsius")) {
                    Temperatura temperatura = new Temperatura("Fahrenheit", "Celsius");
                    resultadoTemperatura.setText(String.valueOf(temperatura.convertir(valor)));

                }
                if (Seleccion.equals("De Celsius a Kelvin")) {
                    Temperatura temperatura = new Temperatura("Celsius", "Kelvin");
                    resultadoTemperatura.setText(String.valueOf(temperatura.convertir(valor)));

                }
                if (Seleccion.equals("De Kelvin a Celsius")) {
                    Temperatura temperatura = new Temperatura("Kelvin", "Celsius");
                    resultadoTemperatura.setText(String.valueOf(temperatura.convertir(valor)));
                }
                if (Seleccion.equals("De Fahrenheit a Celsius")) {
                    Temperatura temperatura = new Temperatura("Fahrenheit", "Celsius");
                    resultadoTemperatura.setText(String.valueOf(temperatura.convertir(valor)));
                }
                if (Seleccion.equals("De Kelvin a Fahrenheit")) {
                    Temperatura temperatura = new Temperatura("Kelvin", "Fahrenheit");
                    resultadoTemperatura.setText(String.valueOf(temperatura.convertir(valor)));
                }
            }
        });
    }
}