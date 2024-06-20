package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.functions;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        // Definir un BiFunction para sumar dos números
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        // Usar el BiFunction para sumar dos números
        int result = add.apply(5, 10);

        System.out.println("Suma: " + result);
    }
}
