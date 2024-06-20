package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Definir un Consumer para imprimir nombres
        Consumer<String> printName = name -> System.out.println(name);

        // Usar el Consumer para imprimir cada nombre de la lista
        names.forEach(printName);
    }
}
