package com.courses.capacitacionesflypass.sesion2.d.varargs;

public class VarArgExample {

    // Método que suma una cantidad variable de números
    public static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(1, 2, 3)); // Output: Sum: 6
        System.out.println("Sum: " + sum(4, 5)); // Output: Sum: 9
        System.out.println("Sum: " + sum(7, 8, 9, 10)); // Output: Sum: 34
    }
}
