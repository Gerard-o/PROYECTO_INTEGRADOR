package com.example.testpi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class PesoActivity extends AppCompatActivity {
    Spinner spinnerPeso;
    EditText valorPeso;
    Button btnCalcularPeso;
    TextView resultadoPeso;

    Button btnBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);

        spinnerPeso = findViewById(R.id.spinnerPeso);
        valorPeso = findViewById(R.id.valorPeso);
        btnCalcularPeso = findViewById(R.id.btnCalcularPeso);
        resultadoPeso = findViewById(R.id.resultadoPeso);
        Button btnBorrar = findViewById(R.id.BorrarPeso);
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorPeso.setText("");
            }
        });
        btnCalcularPeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Seleccion = spinnerPeso.getSelectedItem().toString();
                double valor = Double.parseDouble(valorPeso.getText().toString());
                if (Seleccion.equals("De Kilogramos a Libras")) {
                    Peso peso = new Peso("kilogramos", "Libras");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (Seleccion.equals("De Libras a Kilogramos")) {
                    Peso peso = new Peso("Libras", "kilogramos");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));

                }
                if (Seleccion.equals("De Gramos a Libras")) {
                    Peso peso = new Peso("Gramos", "Libras");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));

                }
                if (Seleccion.equals("De Libras a Gramos")) {
                    Peso peso = new Peso("Libras", "Gramos");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));

                }
            }
        });
    }
}
