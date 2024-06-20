package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Definir un Predicate para números pares
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Usar el Predicate para filtrar la lista
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(isEven)
                                           .toList();

        System.out.println("Números Pares: " + evenNumbers);
    }
}
