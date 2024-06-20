package com.courses.capacitacionesflypass.sesion2.i.concurrenceparallelism;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample2 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Amanda");

        List<String> result = names.parallelStream()
                                   .filter(name -> name.startsWith("A"))
                                   .map(String::toUpperCase)
                                   .toList();

        System.out.println("Filtered and Uppercased Names: " + result); // Output: [ALICE, AMANDA]
    }
}
