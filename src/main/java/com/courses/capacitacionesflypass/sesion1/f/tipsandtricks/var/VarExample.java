package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.var;

import java.util.ArrayList;
import java.util.List;

public class VarExample {

    public static void main(String[] args) {
        // Declaración explícita
        List<String> listExplicit = new ArrayList<>();
        listExplicit.add("Hola");
        listExplicit.add("Mundo");
        System.out.println("Lista con declaración explícita: " + listExplicit);

        // Usando var
        var list = new ArrayList<String>();
        list.add("Hola");
        list.add("Mundo");
        System.out.println("Lista con var: " + list);
    }
}
