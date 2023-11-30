package com.example.testpi;

import com.example.testpi.Conversor;

public class Divisa extends Conversor {

    public Divisa(String unidadOrigen, String unidadDestino) {
        super(unidadOrigen, unidadDestino);
    }
    @Override
    public double convertir(double cantidad) {
        if (unidadOrigen.equals("USDT") && unidadDestino.equals("EURO")) {
            return cantidad * 0.85;
        } else if (unidadOrigen.equals("EURO") && unidadDestino.equals("USDT")) {
            return cantidad / 0.85;
        } else if (unidadOrigen.equals("USDT") && unidadDestino.equals("COP")) {
            return cantidad * 4000.0;
        } else if (unidadOrigen.equals("COP") && unidadDestino.equals("USDT")) {
            return cantidad / 4000.0;
        } else {
            throw new IllegalArgumentException("Unidades de conversión no compatibles");
        }
    }
}
