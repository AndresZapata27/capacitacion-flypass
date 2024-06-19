package com.courses.capacitacionesflypass.sesion2.g.generic;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        printList(stringList);
        printList(intList);
    }
}
