package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: calculator <action> [--multiple] <numbers...>");
            System.exit(1);
        }

        String action = args[0];
        boolean isMultiple = Arrays.asList(args).contains("--multiple");
        List<String> numbersInput = Arrays.asList(args).subList(isMultiple ? 2 : 1, args.length);

        try {
            List<Double> numbers = numbersInput.stream().map(Double::parseDouble).toList();

            switch (action) {
                case "add" -> {
                    double sum = add(numbers);
                    System.out.println("Result: " + sum);
                }
                case "multiply" -> {
                    double product = multiply(numbers);
                    System.out.println("Result: " + product);
                }
                default -> {
                    System.err.println("Unknown action: " + action);
                    System.exit(1);
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
            System.exit(1);
        }
    }

    private static double add(List<Double> numbers) {
        return numbers.stream().reduce(0.0, Double::sum);
    }

    private static double multiply(List<Double> numbers) {
        return numbers.stream().reduce(1.0, (a, b) -> a * b);
    }
}

