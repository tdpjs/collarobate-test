package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length == 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("Result: " + (a + b));
        } else {
            System.out.println("Please provide two numbers");
        }
    }
}