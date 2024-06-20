package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Definir una Function para convertir nombres a mayúsculas
        Function<String, String> toUpperCase = String::toUpperCase;

        // Usar la Function para transformar la lista de nombres
        List<String> upperCaseNames = names.stream()
                                           .map(toUpperCase)
                                           .toList();

        System.out.println("Nombres en Mayúsculas: " + upperCaseNames);
    }
}
