package com.courses.capacitacionesflypass.sesion2.d.varargs;

public class VarArgStringExample {

    // Método que concatena una cantidad variable de cadenas
    public static String concatenate(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(concatenate("Hello", "World")); // Output: Hello World
        System.out.println(concatenate("Java", "Var-args", "Example")); // Output: Java Var-args Example
    }
}
