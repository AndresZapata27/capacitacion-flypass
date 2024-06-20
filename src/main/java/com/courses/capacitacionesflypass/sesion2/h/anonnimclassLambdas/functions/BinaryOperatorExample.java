package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.functions;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        // Definir un BinaryOperator para encontrar el máximo de dos números
        BinaryOperator<Integer> max = Integer::max;

        // Usar el BinaryOperator para encontrar el máximo de dos números
        int result = max.apply(5, 10);

        System.out.println("Máximo: " + result);
    }
}
