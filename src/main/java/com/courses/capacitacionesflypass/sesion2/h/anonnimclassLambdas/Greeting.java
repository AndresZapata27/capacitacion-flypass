package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas;

public interface Greeting {
    void greet(String name);
}


class AnonymousClassCustomInterfaceExample {
    public static void main(String[] args) {
        // Implementación de la interfaz Greeting utilizando una clase anónima
        Greeting greeting = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Hello, " + name + "!");
            }
        };

        // Uso del método greet
        greeting.greet("Alice");  // Output: Hello, Alice!
        greeting.greet("Bob");    // Output: Hello, Bob!
    }
}

