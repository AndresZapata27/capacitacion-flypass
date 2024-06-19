package com.courses.capacitacionesflypass.sesion2.d.varargs;

public class VarArgAverageExample {

    // Método que calcula el promedio de una cantidad variable de números
    public static double average(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required");
        }
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println("Average: " + average(1.0, 2.0, 3.0)); // Output: Average: 2.0
        System.out.println("Average: " + average(4.0, 5.0)); // Output: Average: 4.5
        System.out.println("Average: " + average(7.0, 8.0, 9.0, 10.0)); // Output: Average: 8.5
    }
}
