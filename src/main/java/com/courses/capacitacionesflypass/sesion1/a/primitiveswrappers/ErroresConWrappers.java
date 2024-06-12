package com.courses.capacitacionesflypass.sesion1.a.primitiveswrappers;

public class ErroresConWrappers {

    public static void main(String[] args) {

        Integer a1 = 500;
        Integer b1 = 500;

        System.out.println(a1 == b1);  // false, porque compara referencias  -> Stack

        System.out.println(a1.equals(b1));  // true, porque compara valores  ->  Heap



        Integer sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;  // Autoboxing en cada iteración  creara 1000 objetos en memoria
        }


    }

}

/*Resumen

Verificar Nulos: Siempre verificar si el wrapper es null antes de utilizarlo para evitar NullPointerException.

Usar equals: Utilizar el método equals para comparar valores de wrappers en lugar de ==.

Optimizar Autoboxing: Minimizar el uso de autoboxing y unboxing en bucles intensivos para evitar el overhead de rendimiento.

Usar Primitivos cuando sea Posible: Utilizar tipos primitivos en lugar de wrappers cuando no se requieran características
específicas de los objetos.

Entender el Integer Cache: Conocer cómo funciona el caché de Integer y sus limitaciones para evitar errores en comparaciones.*/

