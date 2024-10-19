package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length == 2) {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            System.out.println("Result: " + (a + b));
        } else {
            System.out.println("Please provide two numbers");
        }
    }
}