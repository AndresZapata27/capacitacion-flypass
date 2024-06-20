package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Definir un BiPredicate para verificar si la longitud del nombre es mayor que un número dado
        BiPredicate<String, Integer> isLengthGreaterThan = (name, length) -> name.length() > length;

        // Usar el BiPredicate para filtrar la lista de nombres
        int lengthThreshold = 3;
        List<String> filteredNames = names.stream()
                                          .filter(name -> isLengthGreaterThan.test(name, lengthThreshold))
                                          .toList();

        System.out.println("Nombres con longitud mayor a " + lengthThreshold + ": " + filteredNames);
    }
}
