package com.courses.capacitacionesflypass.sesion2.g.generic;

import java.util.Optional;

public class OptionalExample {

    public static Optional<String> getName(boolean returnName) {
        if (returnName) {
            return Optional.of("John Doe");
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        Optional<String> nameOptional = getName(true);
        nameOptional.ifPresent(name -> System.out.println("Name: " + name));

        Optional<String> emptyOptional = getName(false);
        System.out.println("Is name present: " + emptyOptional.isPresent());
    }
}
