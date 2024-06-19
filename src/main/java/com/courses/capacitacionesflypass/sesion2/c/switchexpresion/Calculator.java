package com.courses.capacitacionesflypass.sesion2.c.switchexpresion;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        String operation = "ADD";

        double result = switch (operation) {
            case "ADD" -> add(num1, num2);
            case "SUBTRACT" -> subtract(num1, num2);
            case "MULTIPLY" -> multiply(num1, num2);
            case "DIVIDE" -> divide(num1, num2);
            default -> throw new IllegalArgumentException("Unknown operation: " + operation);
        };

        System.out.println("Result: " + result);
    }
}


class OldSwitchEnumMethodExample {

    public enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    public static double applyOperation(Operation operation, double a, double b) {
        return switch (operation) {
            case ADD -> a + b;
            case SUBTRACT -> a - b;
            case MULTIPLY -> a * b;
            case DIVIDE -> {
                if (b == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                yield a / b;
            }
        };
    }

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        Operation operation = Operation.ADD;

        double result = applyOperation(operation, num1, num2);
        System.out.println("Result: " + result);
    }
}
