package com.courses.capacitacionesflypass.sesion1.tipsandtricks.var;

import java.util.List;

public class VarStreamExample {

    public static void main(String[] args) {
        var list = List.of("uno", "dos", "tres", "cuatro");

        var upperCaseList = list.stream()
                                .map(String::toUpperCase)
                                .toList();

        System.out.println("Lista en mayúsculas: " + upperCaseList);
    }
}
