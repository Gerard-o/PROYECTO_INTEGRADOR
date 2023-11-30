package com.example.testpi;

import com.example.testpi.Conversor;

public class Binario extends Conversor {

    public Binario(String unidadOrigen, String unidadDestino) {
        super(unidadOrigen, unidadDestino);
    }
    public String decimalToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    public int binaryToDecimal(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }

    public String decimalToHexadecimal(int decimalNumber) {
        return Integer.toHexString(decimalNumber);
    }

    public int hexadecimalToDecimal(String hexadecimalNumber) {
        return Integer.parseInt(hexadecimalNumber, 16);
    }

    @Override
    public double convertir(double cantidad) {
        if (unidadOrigen.equals("Decimal") && unidadDestino.equals("Binario")) {
            return Double.parseDouble(decimalToBinary((int) cantidad));
        } else if (unidadOrigen.equals("Binario") && unidadDestino.equals("Decimal")) {
            return binaryToDecimal(String.valueOf((int) cantidad));
        } else if (unidadOrigen.equals("Decimal") && unidadDestino.equals("Hexadecimal")) {
            return Double.parseDouble(decimalToHexadecimal((int) cantidad));
        } else if (unidadOrigen.equals("Hexadecimal") && unidadDestino.equals("Decimal")) {
            return hexadecimalToDecimal(String.valueOf((int) cantidad));
        } else {
            throw new IllegalArgumentException("Unidades de conversión no compatibles");
        }
    }

}




