package com.courses.capacitacionesflypass.sesion2.i.concurrenceparallelism;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.parallelStream()
                         .mapToInt(ParallelStreamExample1::transform)
                         .sum();

        System.out.println("Sum: " + sum); // Output: Sum of transformed numbers
    }

    private static int transform(int number) {
        // Simular una operación costosa
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return number * 2;
    }
}
