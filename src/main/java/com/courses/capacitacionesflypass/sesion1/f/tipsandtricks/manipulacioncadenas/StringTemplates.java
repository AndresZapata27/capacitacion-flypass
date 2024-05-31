package com.courses.capacitacionesflypass.sesion1.f.tipsandtricks.manipulacioncadenas;

import java.text.MessageFormat;

public class StringTemplates {

    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        float altura = 1.89F;

        // %s  = strings
        // %d  =  enteros
        // %f o indicando decimales %.2f  = puntos flotantes


        // Usando String.format
        String formattedString = String.format("My name is %s and I am %d years old, and tall %f", name, age, altura);
        System.out.println(formattedString);

        // Usando String.formatted
        String string = "My name is %s and I am %d years old, and tall %f";
        String stringFromated = string.formatted(name, age, altura); // My name is %s and I am %d years old, and tall %f".formatted(name, age, altura);
        System.out.println(stringFromated);

        // Usando MessageFormat.format
        String template = "My name is {0} and I am {1} years old, and tall %f";
        Object[] params = {"John", 30, altura};
        String formattedString2 = MessageFormat.format(template, params);
        System.out.println(formattedString2);
    }




    public static void main2(String[] args) {
        String name = "John";
        int age = 30;
        float height = 1.89F;

        // %s  = strings
        // %d  =  enteros
        // %f o indicando decimales %.2f  = puntos flotantes

        // Usando String.format
        long startTime1 = System.nanoTime();
        String formattedString = String.format("My name is %s and I am %d years old, and tall %f", name, age, height);
        long endTime1 = System.nanoTime();
        System.out.println(formattedString + " (String.format) - Time: " + (endTime1 - startTime1) + " ns");

        // Usando String.formatted
        long startTime2 = System.nanoTime();
        String string = "My name is %s and I am %d years old, and tall %f";
        String stringFormatted = string.formatted(name, age, height);
        long endTime2 = System.nanoTime();
        System.out.println(stringFormatted + " (String.formatted) - Time: " + (endTime2 - startTime2) + " ns");

        // Usando MessageFormat.format
        long startTime3 = System.nanoTime();
        String template = "My name is {0} and I am {1} years old, and tall {2}";
        Object[] params = {name, age, height};
        String formattedString2 = MessageFormat.format(template, params);
        long endTime3 = System.nanoTime();
        System.out.println(formattedString2 + " (MessageFormat.format) - Time: " + (endTime3 - startTime3) + " ns");
    }
}
