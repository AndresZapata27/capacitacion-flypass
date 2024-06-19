package com.courses.capacitacionesflypass.sesion2.h.anonnimclases;

public class AnonymousClassExample2 {
    static abstract class Person {
        abstract void displayInfo();
    }

    public static void main(String[] args) {
        // Creación de una clase anónima que extiende la clase Person
        Person person = new Person() {
            @Override
            void displayInfo() {
                System.out.println("This is an anonymous class extending Person.");
            }
        };

        // Llamada al método de la clase anónima
        person.displayInfo();
    }
}
