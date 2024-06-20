package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaAdvancedGroupingExample {

    // Función para agrupar elementos por longitud
    private static Function<String, Integer> byLength() {
        return String::length;
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        // Uso de funciones en el stream para agrupar y contar elementos
        Map<Integer, Long> groupedAndCounted = words.stream()
                .collect(Collectors.groupingBy(byLength(), Collectors.counting()));

        groupedAndCounted.forEach((length, count) -> 
                System.out.println("Length: " + length + ", Count: " + count));
        // Output:
        // Length: 5, Count: 2
        // Length: 6, Count: 2
        // Length: 4, Count: 1
        // Length: 10, Count: 1
        // Length: 3, Count: 1
    }
}
