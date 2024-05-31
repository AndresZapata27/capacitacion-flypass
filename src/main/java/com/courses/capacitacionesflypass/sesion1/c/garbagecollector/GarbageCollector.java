package com.courses.capacitacionesflypass.sesion1.c.garbagecollector;

public class GarbageCollector {

    public static void main(String[] args) {

        hacerCosasDeGato();
        System.out.println("Estoy haciendo cosas de gato");

    }


    private static void hacerCosasDeGato(){

        Integer numeroGatos = 1;

        Cat myCat = new Cat(14,"pepito", "macho", 50L );
        myCat.meow();

        otroMetodo();
    }

    private static void otroMetodo() {

        long otroNum = 10;

        Cat otroCat = new Cat();

    }

}
