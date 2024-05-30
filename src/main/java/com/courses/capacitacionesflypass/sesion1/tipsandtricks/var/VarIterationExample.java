package com.courses.capacitacionesflypass.sesion1.tipsandtricks.var;

import java.util.HashMap;
import java.util.Map;

public class VarIterationExample {

    public static void main(String[] args) {
        var map = new HashMap<String, Integer>();
        map.put("Uno", 1);
        map.put("Dos", 2);
        map.put("Tres", 3);

        for (var entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
