package org.example;

public class Operations {
    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    public static Double add(Double a, Double b) {
        return a + b;
    }

    public static Double subtract(Double a, Double b) {
        return a - b;
    }

    public static Double divide(Double a, Double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Divisor cannot be 0");
        }
        return a / b;
    }
}
