package com.courses.capacitacionesflypass.sesion2.g.generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BoundedTypeExample {

    public static <T extends Comparable<T>> T findMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Max in Integer List: " + findMax(intList));

        List<String> strList = Arrays.asList("apple", "banana", "cherry");
        System.out.println("Max in String List: " + findMax(strList));
    }
}
