package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.var;

import java.util.ArrayList;

public class VarExample1 {

    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("Hola");
        list.add("Mundo");

        for (var str : list) {
            System.out.println(str);
        }
    }
}
