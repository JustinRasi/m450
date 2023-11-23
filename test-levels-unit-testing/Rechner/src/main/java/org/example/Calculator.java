package org.example;

public class Calculator {

    public double add(double zahl1, double zahl2) {
        return zahl1 + zahl2;
    }

    public double subtract(double zahl1, double zahl2) {
        return zahl1 - zahl2;
    }

    public double multiply(double zahl1, double zahl2) {
        return zahl1 * zahl2;
    }

    public double divide(double zahl1, double zahl2) {
        if (zahl2 == 0) {
            throw new ArithmeticException("0 Division not allowed");
        }
        return zahl1 / zahl2;
    }
}
