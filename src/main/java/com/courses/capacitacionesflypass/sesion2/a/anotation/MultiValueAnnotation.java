package com.courses.capacitacionesflypass.sesion2.a.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MultiValueAnnotation {
    String name() default "Unknown";
    int age() default 0;
}


class Person {

    @MultiValueAnnotation
    public void defaultInfo() {
        System.out.println("This method uses default values for the annotation.");
    }

    @MultiValueAnnotation(name = "John Doe", age = 30)
    public void customInfo() {
        System.out.println("This method uses custom values for the annotation.");
    }

    public static void main(String[] args) throws Exception {
        Person person = new Person();

        // Procesamiento de anotaciones en tiempo de ejecución
        Method defaultMethod = person.getClass().getMethod("defaultInfo");
        if (defaultMethod.isAnnotationPresent(MultiValueAnnotation.class)) {
            MultiValueAnnotation defaultAnnotation = defaultMethod.getAnnotation(MultiValueAnnotation.class);
            System.out.println("Default Method Annotation - Name: " + defaultAnnotation.name() + ", Age: " + defaultAnnotation.age());
        }

        Method customMethod = person.getClass().getMethod("customInfo");
        if (customMethod.isAnnotationPresent(MultiValueAnnotation.class)) {
            MultiValueAnnotation customAnnotation = customMethod.getAnnotation(MultiValueAnnotation.class);
            System.out.println("Custom Method Annotation - Name: " + customAnnotation.name() + ", Age: " + customAnnotation.age());
        }

        person.defaultInfo();
        person.customInfo();
    }
}
