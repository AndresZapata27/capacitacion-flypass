package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.functions;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        // Definir un Supplier para proporcionar un mensaje de bienvenida
        Supplier<String> welcomeMessage = () -> "¡Bienvenido a Java!";

        // Usar el Supplier para obtener el mensaje
        String message = welcomeMessage.get();

        System.out.println(message);
    }
}
