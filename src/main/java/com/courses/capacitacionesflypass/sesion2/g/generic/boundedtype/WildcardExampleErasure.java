package com.courses.capacitacionesflypass.sesion2.g.generic.boundedtype;

import java.util.ArrayList;
import java.util.List;

public class WildcardExampleErasure {

    public static void copyList(List dest, List src) {
        for (Object item : src) {
            dest.add(item);
        }
    }

    public static void main(String[] args) {
        List numbers = new ArrayList();
        List integers = new ArrayList(List.of(1, 2, 3, 4, 5));

        copyList(numbers, integers);

        System.out.println("Numbers List: " + numbers);
    }
}
