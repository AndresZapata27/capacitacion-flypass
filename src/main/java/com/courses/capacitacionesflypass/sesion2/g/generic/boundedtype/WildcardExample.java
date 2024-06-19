package com.courses.capacitacionesflypass.sesion2.g.generic.boundedtype;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    public static <T> void copyList(List<? super T> dest, List<? extends T> src) {
        for (T item : src) {
            dest.add(item);
        }
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        copyList(numbers, integers);

        System.out.println("Numbers List: " + numbers);
    }
}
