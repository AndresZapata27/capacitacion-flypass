package com.courses.capacitacionesflypass.sesion2.h.anonnimclases;

public class AnonymousClassExample {
    public static void main(String[] args) {
        // Creación de una clase anónima que implementa la interfaz Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from a Runnable implemented by an anonymous class!");
            }
        };

        // Ejecutar la clase anónima
        new Thread(runnable).start();
    }
}
