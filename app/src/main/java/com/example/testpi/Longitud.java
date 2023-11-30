package com.example.testpi;

import com.example.testpi.Conversor;

public class Longitud extends Conversor {

    public Longitud(String unidadOrigen, String unidadDestino) {
        super(unidadOrigen, unidadDestino);
    }

    @Override
    public double convertir(double cantidad) {
        if (unidadOrigen.equals("Metros") && unidadDestino.equals("Pies")) {
            return cantidad * 3.28084;
        } else if (unidadOrigen.equals("Pies") && unidadDestino.equals("Metros")) {
            return cantidad / 3.28084;
        } else if (unidadOrigen.equals("Kilómetros") && unidadDestino.equals("Millas")) {
            return cantidad * 0.621371;
        } else if (unidadOrigen.equals("Millas") && unidadDestino.equals("Kilómetros")) {
            return cantidad / 0.621371;
        } else {
            throw new IllegalArgumentException("Unidades de longitud no compatibles");
        }
    }
}
