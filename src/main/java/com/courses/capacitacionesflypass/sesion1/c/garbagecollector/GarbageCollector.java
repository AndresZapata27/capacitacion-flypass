package com.courses.capacitacionesflypass.sesion1.c.garbagecollector;

public class GarbageCollector {

    public static void main(String[] args) {

        hacerCosasDeGato();
        System.out.println("Estoy haciendo cosas de gato");

    }

    // contexto , scope , alcance

    private static void hacerCosasDeGato(){

        Integer numeroGatos = 1;

        Cat myCat = new Cat(14,"pepito", "macho", 50L );
        myCat.meow();


        long otroNum = 10;
        otroMetodo(otroNum);

        System.gc();

        //mil linea de codigo mas
    }

    private static void otroMetodo(long nm) {



        Cat otroCat = new Cat();

    }

}
