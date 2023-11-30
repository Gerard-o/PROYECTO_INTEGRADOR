package com.example.testpi;

public class Peso extends Conversor {

    public Peso(String unidadOrigen, String unidadDestino) {
        super(unidadOrigen, unidadDestino);
    }

    @Override
    public double convertir(double cantidad) {
        if (unidadOrigen.equals("kilogramos") && unidadDestino.equals("Libras")) {
            return cantidad * 2.20462;
        } else if (unidadOrigen.equals("Libras") && unidadDestino.equals("kilogramos")) {
            return cantidad / 2.20462;
        } else if (unidadOrigen.equals("Gramos") && unidadDestino.equals("Libras")) {
            return cantidad * 453.59237;
        } else if (unidadOrigen.equals("Libras") && unidadDestino.equals("Gramos")) {
            return cantidad  / 453.59237;
        } else {
            throw new IllegalArgumentException("Unidades de peso no compatibles");
        }
    }
}
