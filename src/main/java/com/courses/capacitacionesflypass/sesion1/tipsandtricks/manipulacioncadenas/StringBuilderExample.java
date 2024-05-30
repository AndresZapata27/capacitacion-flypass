package com.courses.capacitacionesflypass.sesion1.tipsandtricks.manipulacioncadenas;

public class StringBuilderExample {

    public static void main(String[] args) {

        String message = "Hola, " + "mundo!";
        System.out.println(message);


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("Número ").append(i).append(" ");
        }
        String message2 = sb.toString();
        System.out.println(message2);
    }
}
