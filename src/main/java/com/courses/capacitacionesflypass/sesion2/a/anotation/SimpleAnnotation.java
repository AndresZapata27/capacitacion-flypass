package com.courses.capacitacionesflypass.sesion2.a.anotation;// Definición de una anotación simple
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Esta anotación puede ser usada en métodos
@Target(ElementType.METHOD)
// La anotación estará disponible en tiempo de ejecución
@Retention(RetentionPolicy.RUNTIME)
public @interface SimpleAnnotation {
    String value() default "default value";
}

// Uso de la anotación
class MyClass {
    
    @SimpleAnnotation(value = "Hello, Annotations!")
    public void annotatedMethod() {
        System.out.println("This method is annotated");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.annotatedMethod();
    }
}
