package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Definir un UnaryOperator para incrementar números
        UnaryOperator<Integer> increment = n -> n + 1;

        // Usar el UnaryOperator para incrementar cada número en la lista
        List<Integer> incrementedNumbers = numbers.stream()
                                                  .map(increment)
                                                  .toList();

        System.out.println("Números Incrementados: " + incrementedNumbers);
    }
}
