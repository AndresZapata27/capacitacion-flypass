package com.courses.capacitacionesflypass.sesion2.g.generic;

public class BoundedTypeParametersExample {

    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(10, 20));
        System.out.println("Sum: " + sum(15.5, 10.3));
    }
}
