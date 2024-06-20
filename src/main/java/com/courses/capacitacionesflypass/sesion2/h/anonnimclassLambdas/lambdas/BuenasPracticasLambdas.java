package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BuenasPracticasLambdas {

    public static void main(String[] args) {

        Predicate<String> isLongerThan5 = s -> s.length() > 5;

        List<String> names = List.of("John", "Alice", "Bob");

        names.stream()
                .filter(isLongerThan5)
                .forEach(System.out::println);
    }
}
