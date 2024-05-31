package com.courses.capacitacionesflypass.generalidades.clases;

public @interface MyAnnotation {
    String value();
    int count() default 1;
}

@MyAnnotation(value = "example", count = 2)
public class AnnotatedClass {
    // Código de la clase
}
