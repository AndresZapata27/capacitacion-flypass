package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas;

import java.util.Arrays;
import java.util.List;

public class BasicStreamOperatorExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","aliCE","boB", "Bob", "Charlie", "David", "Edward","EdwARd");

        // Operadores intermedios: map, filter, flatMap, distinct, sorted, limit.
        List<String> upperCaseNames = names.stream()
                .filter(name -> name.length() > 3) // Filtra nombres con más de 3 caracteres
                .map(String::toUpperCase) // Convierte los nombres a mayúsculas
                .distinct() // Elimina elementos duplicados
                .sorted() // Ordena los números en orden ascendente
                .toList(); // Operador terminal:  collect, count, forEach, reduce, findFirst, anyMatch.

        System.out.println("Nombres en mayúsculas con más de 3 caracteres: " + upperCaseNames);
        // Output: Nombres en mayúsculas con más de 3 caracteres: [ALICE, CHARLIE, DAVID, EDWARD]
    }
}
